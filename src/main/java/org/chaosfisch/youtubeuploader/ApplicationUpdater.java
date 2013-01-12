/*******************************************************************************
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: Dennis Fischer
 ******************************************************************************/
package org.chaosfisch.youtubeuploader;

import java.io.File;
import java.net.URISyntaxException;

import com.panayotis.jupidator.UpdatedApplication;
import com.panayotis.jupidator.Updater;
import com.panayotis.jupidator.UpdaterException;

public class ApplicationUpdater implements UpdatedApplication {

	public ApplicationUpdater() {
		try {
			new Updater(ApplicationData.BASEURL, getApplicationDirectory(), ApplicationData.DATA_DIR, ApplicationData.release,
					ApplicationData.VERSION, this).actionDisplay();
		} catch (final UpdaterException | URISyntaxException ex) {
			ex.printStackTrace();
		}
	}

	private String getApplicationDirectory() throws URISyntaxException {
		return new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getAbsolutePath();
	}

	@Override
	public boolean requestRestart() {
		return true;
	}

	@Override
	public void receiveMessage(final String message) {
		System.err.println(message);
	}

}
