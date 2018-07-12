package com.bank.accounts.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bank.accounts.model.Account;


@Repository
public class AccountRepositoryImpl implements AccountRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Account load(String num) {
		return entityManager.find(Account.class, num);
	}

	@Override
	public Account update(Account account) {
		return entityManager.merge(account);
	}
	
	@Override
	public List<String> getBeneficiaries() {
		String jpql="select a.num from Account a";
		Query query=entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
