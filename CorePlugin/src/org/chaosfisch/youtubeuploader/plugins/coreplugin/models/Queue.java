/*
 * Copyright (c) 2012, Dennis Fischer
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.chaosfisch.youtubeuploader.plugins.coreplugin.models;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Dennis
 * Date: 07.01.12
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 */
public class Queue implements IModel
{
	public           String   category;
	public           String   description;
	public           String   file;
	public           String   keywords;
	public           String   mimetype;
	public           String   status;
	public           String   title;
	public           String   uploadurl;
	public           String   videoId;
	public           boolean  archived;
	public           boolean  commentvote;
	public           boolean  inprogress;
	public           boolean  locked;
	public           boolean  mobile;
	public           boolean  privatefile;
	public           boolean  rate;
	public           boolean  unlisted;
	public           boolean  embed;
	public           boolean  failed;
	public           short    comment;
	public           short    videoresponse;
	public           int      progress;
	public           int      sequence;
	public           Date     started;
	public           Date     eta;
	public transient int      identity;
	public           Account  account;
	public           Playlist playlist;

	@Override public Integer getIdentity()
	{
		return this.identity;
	}
}
