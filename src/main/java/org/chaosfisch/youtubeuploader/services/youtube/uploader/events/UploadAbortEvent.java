package org.chaosfisch.youtubeuploader.services.youtube.uploader.events;

import org.chaosfisch.youtubeuploader.models.Upload;

public class UploadAbortEvent {

	private final Upload	upload;

	public UploadAbortEvent(final Upload upload) {
		this.upload = upload;
	}

	public Upload getUpload() {
		return upload;
	}
}