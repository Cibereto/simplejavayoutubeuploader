/**************************************************************************************************
 * Copyright (c) 2014 Dennis Fischer.                                                             *
 * All rights reserved. This program and the accompanying materials                               *
 * are made available under the terms of the GNU Public License v3.0+                             *
 * which accompanies this distribution, and is available at                                       *
 * http://www.gnu.org/licenses/gpl.html                                                           *
 *                                                                                                *
 * Contributors: Dennis Fischer                                                                   *
 **************************************************************************************************/

package de.chaosfisch.google.category;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import de.chaosfisch.google.GDataConfig;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class GoogleCategoryService implements ICategoryService {
	private static final String                            CATEGORY_URL        = "https://www.googleapis.com/youtube/v3/videoCategories?part=id,snippet&hl=%s&regionCode=%s&key=%s";
	private static final Logger                            LOGGER              = LoggerFactory.getLogger(GoogleCategoryService.class);
	private static final int                               NOT_MODIFIED_HEADER = 304;
	private final        SimpleListProperty<CategoryModel> categoryModels      = new SimpleListProperty<>(FXCollections.observableArrayList());
	private final        Gson                              gson                = new GsonBuilder().create();
	private final String dataLocation;
	private       String currentETag;


	public GoogleCategoryService(final String dataLocation) {
		this.dataLocation = dataLocation;
		loadCategories();
	}

	private void loadCategories() {
		try (FileReader fileReader = new FileReader(dataLocation + "/cache/categories.json")) {
			processCategoryFeed(gson.fromJson(fileReader, CategoryFeed.class));
		} catch (final IOException | JsonSyntaxException e) {
			LOGGER.info("Category cache file not existing!");
			final File directory = new File(dataLocation + "/cache");
			if (!directory.isDirectory()) {
				LOGGER.info("Creating cache directory!");
				directory.mkdirs();
			}
		}
	}

	private void processCategoryFeed(final CategoryFeed categoryFeed) {
		if (null == categoryFeed) {
			return;
		}
		currentETag = categoryFeed.getEtag();
		for (final CategoryItem item : categoryFeed.getItems()) {
			if (item.getSnippet().isAssignable()) {
				final CategoryModel categoryModel = new CategoryModel();
				categoryModel.setName(item.getSnippet().getTitle());
				categoryModel.setYoutubeId(Integer.parseInt(item.getId()));
				if (!categoryModels.contains(categoryModel)) {
					categoryModels.add(categoryModel);
				} else {
					categoryModels.set(categoryModels.indexOf(categoryModel), categoryModel);
				}
			}
		}
	}

	@Override
	public void refresh() {
		final GetRequest request = Unirest.get(String.format(CATEGORY_URL, Locale.getDefault().getCountry(), Locale.getDefault().getCountry(), GDataConfig.ACCESS_KEY));

		if (null != currentETag) {
			request.header("If-None-Match", currentETag);
		}

		request.header("Accept-Encoding", "gzip")
				.asStringAsync(new Callback<String>() {
					@Override
					public void completed(final HttpResponse<String> response) {
						if (NOT_MODIFIED_HEADER == response.getCode()) {
							LOGGER.info("Categories up to date!");
							return;
						}
						LOGGER.info("Category refresh succeeded");
						final CategoryFeed categoryFeed = gson.fromJson(response.getBody(), CategoryFeed.class);
						processCategoryFeed(categoryFeed);
						cacheFeed(categoryFeed);
					}

					@Override
					public void failed(final UnirestException e) {
						LOGGER.warn("Failed refreshing categories!", e);
					}

					@Override
					public void cancelled() {
						LOGGER.info("Category refresh canceled");
					}
				});
	}

	@Override
	public SimpleListProperty<CategoryModel> categoryModelsProperty() {
		return categoryModels;
	}

	private void cacheFeed(final CategoryFeed categoryFeed) {
		try (final FileWriter fileWriter = new FileWriter(dataLocation + "/cache/categories.json")) {
			gson.toJson(categoryFeed, fileWriter);
			LOGGER.info("Wrote category cache file!");
		} catch (final IOException e) {
			LOGGER.warn("Couldn't write cache file!", e);
		}
	}

	public ObservableList<CategoryModel> getCategoryModels() {
		return categoryModels.get();
	}

	public void setCategoryModels(final ObservableList<CategoryModel> categoryModels) {
		this.categoryModels.set(categoryModels);
	}
}
