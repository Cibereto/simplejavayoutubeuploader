/**************************************************************************************************
 * Copyright (c) 2014 Dennis Fischer.                                                             *
 * All rights reserved. This program and the accompanying materials                               *
 * are made available under the terms of the GNU Public License v3.0+                             *
 * which accompanies this distribution, and is available at                                       *
 * http://www.gnu.org/licenses/gpl.html                                                           *
 *                                                                                                *
 * Contributors: Dennis Fischer                                                                   *
 **************************************************************************************************/

package de.chaosfisch.data.category;

import com.xeiam.yank.DBProxy;
import de.chaosfisch.data.AbstractDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryDTO> implements ICategoryDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(CategoryDAO.class);

	public CategoryDAO() {
		super(CategoryDTO.class);
	}

	@Override
	public List<CategoryDTO> getAll() {
		return intern(DBProxy.queryObjectListSQLKey("pool", "CATEGORY_GET_ALL", CategoryDTO.class, null));
	}

	@Override
	public void store(final CategoryDTO object) {
		LOGGER.debug("Updating CategoryDTO: {}", object);

		final Object[] params = {
				object.getName(),
				object.getYoutubeId()
		};

		final int changed = DBProxy.executeSQLKey("pool", "CATEGORY_UPDATE", params);
		if (0 == changed) {
			LOGGER.debug("Storing new CategoryDTO: {}", object);
			assert 0 != DBProxy.executeSQLKey("pool", "CATEGORY_INSERT", params);
			intern(object);
		}
	}

	@Override
	public void remove(final CategoryDTO object) {
		LOGGER.debug("Removing CategoryDTO: {}", object);
		assert 0 != DBProxy.executeSQLKey("pool", "CATEGORY_REMOVE", new Object[]{
				object.getYoutubeId()
		});
	}

	@Override
	public CategoryDTO get(final int id) {
		return intern(DBProxy.querySingleObjectSQLKey("pool", "CATEGORY_GET", CategoryDTO.class, new Object[]{
				id
		}));
	}
}
