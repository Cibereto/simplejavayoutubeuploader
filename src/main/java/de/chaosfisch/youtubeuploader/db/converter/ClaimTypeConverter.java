/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

package de.chaosfisch.youtubeuploader.db.converter;

import de.chaosfisch.google.youtube.upload.metadata.permissions.ClaimType;
import org.jooq.impl.EnumConverter;

public class ClaimTypeConverter extends EnumConverter<String, ClaimType> {

	private static final long serialVersionUID = 417856196526112892L;

	public ClaimTypeConverter() {
		super(String.class, ClaimType.class);
	}
}
