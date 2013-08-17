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
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {

	private static final long serialVersionUID = 5650306344672785865L;
	private String id;
	private String name;
	@SuppressWarnings("NonConstantFieldWithUpperCaseName")
	private String SID;
	@SuppressWarnings("NonConstantFieldWithUpperCaseName")
	private String LSID;
	private String refreshToken;
	private final List<Playlist> playlists = new ArrayList<>(0);

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSID() {
		return SID;
	}

	public void setSID(final String SID) {
		this.SID = SID;
	}

	public String getLSID() {
		return LSID;
	}

	public void setLSID(final String LSID) {
		this.LSID = LSID;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(final String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public List<Playlist> getPlaylists() {
		return new ArrayList<>(playlists);
	}

	public void setPlaylists(final List<Playlist> playlists) {
		this.playlists.clear();
		this.playlists.addAll(playlists);
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

		return !(null != id ? !id.equals(account.id) : null != account.id);
	}

	@Override
	public int hashCode() {
		return null != id ? id.hashCode() : 0;
	}
}
