package org.chaosfisch.youtubeuploader.command;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

import org.chaosfisch.youtubeuploader.db.dao.UploadDao;
import org.chaosfisch.youtubeuploader.db.generated.tables.pojos.Upload;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

public class UpdateUploadCommand extends Service<Void> {

	@Inject
	private UploadDao	uploadDao;

	public Upload		upload;

	@Override
	protected Task<Void> createTask() {
		return new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				Preconditions.checkNotNull(upload);
				uploadDao.update(upload);
				return null;
			}
		};
	}
}