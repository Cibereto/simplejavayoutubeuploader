/*
 * Copyright (c) 2014 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

package de.chaosfisch.uploader;

import de.chaosfisch.util.TextUtil;

public enum ActionOnFinish {

	NOTHING("queuefinishedlist.donothing"), CLOSE("queuefinishedlist.closeapplication"), SHUTDOWN("queuefinishedlist.shutdown"), SLEEP("queuefinishedlist.hibernate"), CLEAR("queuefinishedlist.clear"), CUSTOM("queuefinishedlist.custom");

	private final String i18n;
	private String command = "";

	ActionOnFinish(final String i18n) {
		this.i18n = i18n;
	}

	@Override
	public String toString() {
		return String.format(TextUtil.getString(i18n), command);
	}

	public ActionOnFinish set(final String command) {
		this.command = command;
		return this;
	}

	public String getCommand() {
		return command;
	}
}
