/*******************************************************************************
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: Dennis Fischer
 ******************************************************************************/
package org.chaosfisch.youtubeuploader.services.youtube.spi;

import java.io.File;

import org.chaosfisch.youtubeuploader.models.Upload;

public interface EnddirService {
	
	public abstract void moveFileByUpload(File fileToMove, Upload upload);
	
}
