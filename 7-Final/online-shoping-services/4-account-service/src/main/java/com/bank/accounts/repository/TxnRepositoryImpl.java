package com.bank.accounts.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bank.accounts.model.Txn;

@Repository
public class TxnRepositoryImpl implements TxnRepopository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(Txn txn) {
		entityManager.persist(txn);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Txn> findAll() {
		return entityManager.createQuery("from Txn").getResultList();
	}

	@Override
	public List<Txn> findAll(int size) {
		Query query = entityManager.createQuery("from Txn");
		query.setFirstResult(0);
		query.setMaxResults(size);
		return query.getResultList();
	}

}
