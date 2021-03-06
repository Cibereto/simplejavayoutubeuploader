/*
 * Copyright (c) 2014 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

package de.chaosfisch.uploader.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.util.ResourceBundle;

@SuppressWarnings("WeakerAccess")
public class UndecoratedDialogController {
	@FXML
	protected ResourceBundle resources;

	@FXML
	protected Node view;

	@FXML
	public void closeDialog(final ActionEvent actionEvent) {
		((Stage) view.getScene().getWindow()).close();
	}
}
