package com.bank.mts;

import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.JdbcAccountRepository;
import com.bank.mts.service.TxrService;
import com.bank.mts.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// Init phase
		// -----------------------------------------
		AccountRepository accountRepository = new JdbcAccountRepository();
		TxrService txrService = new TxrServiceImpl();
		txrService.setAccountRepository(accountRepository);
		// -----------------------------------------

		// use phase
		// -----------------------------------------
		txrService.txr(300.00, "1", "2");
		// -----------------------------------------

		// destroy phase
		// -----------------------------------------
		// -----------------------------------------

	}

}
