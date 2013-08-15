/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

package de.chaosfisch.google.youtube.upload.events;

import de.chaosfisch.google.youtube.upload.Upload;

public class UploadRemoved extends UploadEvent {
	public UploadRemoved(final Upload upload) {
		super(upload);
	}
}
