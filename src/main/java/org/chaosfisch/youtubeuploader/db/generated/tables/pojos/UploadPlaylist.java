/**
 * This class is generated by jOOQ
 */
package org.chaosfisch.youtubeuploader.db.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class UploadPlaylist extends org.chaosfisch.youtubeuploader.db.AbstractPojo implements java.io.Serializable {

	private static final long serialVersionUID = -1210909486;

	private java.lang.Integer id;
	private java.lang.Integer playlistId;
	private java.lang.Integer uploadId;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getPlaylistId() {
		return this.playlistId;
	}

	public void setPlaylistId(java.lang.Integer playlistId) {
		this.playlistId = playlistId;
	}

	public java.lang.Integer getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(java.lang.Integer uploadId) {
		this.uploadId = uploadId;
	}
}
