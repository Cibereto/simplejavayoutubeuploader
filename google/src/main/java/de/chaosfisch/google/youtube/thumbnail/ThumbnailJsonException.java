/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

package de.chaosfisch.google.youtube.thumbnail;

public class ThumbnailJsonException extends Exception {
	private static final long serialVersionUID = -2704426040284831949L;
	private final String json;

	public ThumbnailJsonException(final String json, final Exception e) {
		super(e);
		this.json = json;
	}

	public String getJson() {
		return json;
	}
}
