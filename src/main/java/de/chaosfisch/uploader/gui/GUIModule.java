/**************************************************************************************************
 * Copyright (c) 2014 Dennis Fischer.                                                             *
 * All rights reserved. This program and the accompanying materials                               *
 * are made available under the terms of the GNU Public License v3.0+                             *
 * which accompanies this distribution, and is available at                                       *
 * http://www.gnu.org/licenses/gpl.html                                                           *
 *                                                                                                *
 * Contributors: Dennis Fischer                                                                   *
 **************************************************************************************************/

package de.chaosfisch.uploader.gui;

import dagger.Module;
import dagger.Provides;
import de.chaosfisch.APIModule;
import de.chaosfisch.uploader.gui.account.AccountPresenter;
import de.chaosfisch.uploader.gui.account.AccountView;
import de.chaosfisch.uploader.gui.account.add.*;
import de.chaosfisch.uploader.gui.account.entry.EntryPresenter;
import de.chaosfisch.uploader.gui.account.entry.EntryView;
import de.chaosfisch.uploader.gui.edit.EditDataModel;
import de.chaosfisch.uploader.gui.edit.EditPresenter;
import de.chaosfisch.uploader.gui.edit.EditView;
import de.chaosfisch.uploader.gui.edit.left.EditLeftPresenter;
import de.chaosfisch.uploader.gui.edit.monetization.EditMonetizationView;
import de.chaosfisch.uploader.gui.edit.partner.EditPartnerView;
import de.chaosfisch.uploader.gui.edit.right.EditRightPresenter;
import de.chaosfisch.uploader.gui.main.MainPresenter;
import de.chaosfisch.uploader.gui.project.ProjectPresenter;
import de.chaosfisch.uploader.gui.upload.UploadDataModel;
import de.chaosfisch.uploader.gui.upload.UploadPresenter;
import de.chaosfisch.uploader.gui.upload.UploadView;
import de.chaosfisch.youtube.account.IAccountService;
import de.chaosfisch.youtube.category.ICategoryService;
import de.chaosfisch.youtube.playlist.IPlaylistService;
import de.chaosfisch.youtube.upload.IUploadService;

import javax.inject.Singleton;

@Module(
		includes = {APIModule.class},
		staticInjections = {AccountAddDataModel.class},
		library = true,
		injects = {EditPresenter.class, StepPresenter.class, AddPresenter.class, MainPresenter.class, EditRightPresenter.class, ProjectPresenter.class, UploadPresenter.class, EditLeftPresenter.class, AccountPresenter.class, EntryPresenter.class}
)
public class GUIModule {
	@Provides
	@Singleton
	StepPresenter provideStepPresenter() {
		return new StepPresenter();
	}

	@Provides
	AccountView provideAccountView() {
		return new AccountView();
	}

	@Provides
	EntryView provideEntryView() {
		return new EntryView();
	}

	@Provides
	EditView provideEditView() {
		return new EditView();
	}

	@Provides
	Step1View provideStep1View() {
		return new Step1View();
	}

	@Provides
	Step2View provideStep2View() {
		return new Step2View();
	}

	@Provides
	Step3View provideStep3View() {
		return new Step3View();
	}

	@Provides
	LoadingView provideLoadingView() {
		return new LoadingView();
	}

	@Provides
	UploadView provideUploadsView() {
		return new UploadView();
	}

	@Provides
	EditMonetizationView provideEditMonetizationView() {
		return new EditMonetizationView();
	}

	@Provides
	EditPartnerView provideEditPartnerView() {
		return new EditPartnerView();
	}

	@Provides
	@Singleton
	DataModel provideDataModel(final IAccountService iAccountService, final IPlaylistService iPlaylistService) {
		return new DataModel(iAccountService, iPlaylistService);
	}

	@Provides
	@Singleton
	UploadDataModel provideUploadModel(final IUploadService iUploadService) {
		return new UploadDataModel(iUploadService);
	}

	@Provides
	@Singleton
	EditDataModel provideEditDataModel(final ICategoryService iCategoryService, final IUploadService iUploadService) {
		return new EditDataModel(iCategoryService, iUploadService);
	}
}
