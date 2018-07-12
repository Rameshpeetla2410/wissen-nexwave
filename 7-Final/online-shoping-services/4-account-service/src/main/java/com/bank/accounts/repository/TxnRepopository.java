package com.bank.accounts.repository;

import java.util.List;

import com.bank.accounts.model.Txn;


public interface TxnRepopository {
	void save(Txn txn);
	List<Txn> findAll();
	List<Txn> findAll(int size);
}
