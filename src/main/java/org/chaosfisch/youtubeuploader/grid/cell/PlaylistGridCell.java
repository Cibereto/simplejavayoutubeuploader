/*******************************************************************************
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: Dennis Fischer
 ******************************************************************************/
package org.chaosfisch.youtubeuploader.grid.cell;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import jfxtras.labs.scene.control.grid.GridCell;

import org.chaosfisch.youtubeuploader.models.Playlist;
import org.javalite.activejdbc.Model;

public class PlaylistGridCell extends GridCell<Model> {
	public PlaylistGridCell() {
		itemProperty().addListener(new ChangeListener<Model>() {
			
			@Override public void changed(final ObservableValue<? extends Model> observable, final Model oldValue,
					final Model newValue) {
				final Playlist playlist = (Playlist) newValue;
				getChildren().clear();
				
				if (playlist == null) {
					setGraphic(null);
					return;
				}
				
				getStyleClass().add("image-grid-cell");
				
				final Tooltip tooltip = new Tooltip(playlist.getString("title"));
				
				final Pane pane = new Pane();
				ImageView imageView;
				if (playlist.getString("thumbnail") != null) {
					imageView = new ImageView(playlist.getString("thumbnail"));
					imageView.setPreserveRatio(true);
					final double width = imageView.getImage().getWidth() > 0 ? imageView.getImage().getWidth() : 0;
					final double height = imageView.getImage().getHeight() > 90 ? imageView.getImage().getHeight()
							: 180;
					imageView.setViewport(new Rectangle2D(0, 45, width, height - 90));
				} else {
					imageView = new ImageView(new Image(getClass().getResourceAsStream(
							"/org/chaosfisch/youtubeuploader/resources/images/thumbnail-missing.png")));
				}
				
				imageView.fitHeightProperty().bind(heightProperty());
				imageView.fitWidthProperty().bind(widthProperty());
				
				pane.getChildren().add(imageView);
				setGraphic(pane);
				getGraphic().setOnMouseEntered(new EventHandler<MouseEvent>() {
					
					@Override public void handle(final MouseEvent event) {
						tooltip.show(getGraphic(), event.getScreenX(), event.getScreenY());
					}
				});
				getGraphic().setOnMouseExited(new EventHandler<MouseEvent>() {
					
					@Override public void handle(final MouseEvent event) {
						tooltip.hide();
					}
				});
			}
		});
	}
}
