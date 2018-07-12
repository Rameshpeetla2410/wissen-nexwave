package com.bank.accounts.repository;

import java.util.List;

import com.bank.accounts.model.Account;

public interface AccountRepository {

	Account load(String num);

	Account update(Account account);
	
	List<String> getBeneficiaries();

}
