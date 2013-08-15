/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

/**
 * This class is generated by jOOQ
 */
package de.chaosfisch.google.account;

import de.chaosfisch.google.youtube.playlist.Playlist;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {

	private static final long serialVersionUID = 144852581;

	private int            id;
	private String         name;
	private String         password;
	private List<Playlist> playlists;
	private int            version;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public List<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(final List<Playlist> playlists) {
		this.playlists = playlists;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Account)) {
			return false;
		}

		final Account account = (Account) obj;

		return id == account.id && name.equals(account.name);
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + name.hashCode();
		return result;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}
}
