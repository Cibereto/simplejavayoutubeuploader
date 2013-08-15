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
package de.chaosfisch.google.youtube.playlist;

import de.chaosfisch.google.account.Account;

import java.io.Serializable;

public class Playlist implements Serializable {

	private static final long serialVersionUID = 1215529732;

	private String  id;
	private String  pkey;
	private boolean private_;
	private String  title;
	private String  url;
	private String  thumbnail;
	private int     number;
	private String  summary;
	private boolean hidden;
	private Account account;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getPkey() {
		return pkey;
	}

	public void setPkey(final String pkey) {
		this.pkey = pkey;
	}

	public boolean isPrivate_() {
		return private_;
	}

	public void setPrivate_(final boolean private_) {
		this.private_ = private_;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(final String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(final int number) {
		this.number = number;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(final boolean hidden) {
		this.hidden = hidden;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(final Account account) {
		this.account = account;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Playlist)) {
			return false;
		}

		final Playlist playlist = (Playlist) obj;

		return !(null != id ? !id.equals(playlist.id) : null != playlist.id) && !(null != pkey ?
																				  !pkey.equals(playlist.pkey) :
																				  null != playlist.pkey);
	}

	@Override
	public int hashCode() {
		int result = null != id ? id.hashCode() : 0;
		result = 31 * result + (null != pkey ? pkey.hashCode() : 0);
		return result;
	}
}
