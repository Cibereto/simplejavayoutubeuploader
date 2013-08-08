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

import com.google.inject.Inject;
import de.chaosfisch.google.account.Account;
import de.chaosfisch.uploader.persistence.dao.transactional.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class AccountDaoImpl implements IAccountDao {

	@Inject
	protected EntityManager entityManager;

	@Override
	public List<Account> getAll() {
		return entityManager.createQuery("SELECT a FROM account a", Account.class).getResultList();
	}

	@Override
	public Account get(final int id) {
		return entityManager.find(Account.class, id);
	}

	@Override
	@Transactional
	public void insert(final Account account) {
		entityManager.persist(account);
	}

	@Override
	@Transactional
	public void update(final Account account) {
		entityManager.merge(account);
	}

	@Override
	@Transactional
	public void delete(final Account account) {
		entityManager.remove(account);
	}
}