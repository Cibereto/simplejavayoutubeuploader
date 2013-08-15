/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

package de.chaosfisch.uploader.persistence.dao;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;
import de.chaosfisch.uploader.template.Template;
import de.chaosfisch.uploader.template.events.TemplateAdded;
import de.chaosfisch.uploader.template.events.TemplateRemoved;
import de.chaosfisch.uploader.template.events.TemplateUpdated;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TemplateDaoImpl implements ITemplateDao {

	protected ArrayList<Template> templates = new ArrayList<>(10);
	@Inject
	protected EventBus eventBus;

	@Override
	public List<Template> getAll() {
		return templates;
	}

	@Override
	public Template get(final String id) {
		for (final Template template : templates) {
			if (template.getId().equals(id)) {
				return template;
			}
		}
		return null;
	}

	@Override
	public void insert(final Template template) {
		template.setId(UUID.randomUUID().toString());
		templates.add(template);
		eventBus.post(new TemplateAdded(template));
	}

	@Override
	public void update(final Template template) {
		eventBus.post(new TemplateUpdated(template));
	}

	@Override
	public void delete(final Template template) {
		templates.remove(template);
		eventBus.post(new TemplateRemoved(template));
	}
}
