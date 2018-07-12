package com.bank.accounts.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.accounts.model.Account;
import com.bank.accounts.model.Txn;
import com.bank.accounts.model.TxnType;
import com.bank.accounts.repository.AccountRepository;
import com.bank.accounts.repository.TxnRepopository;

@Service
public class TxrServiceImpl implements TxrService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TxnRepopository txnRepopository;

	@Transactional
	public void txr(double amount, String fromAccNum, String toAccNum) {
		try {

			Account fromAccount = accountRepository.load(fromAccNum);
			Account toAccount = accountRepository.load(toAccNum);

			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			fromAccount = accountRepository.update(fromAccount);
			boolean b = false;
			if (b)
				throw new RuntimeException();
			toAccount = accountRepository.update(toAccount);

			Txn debitTxn = new Txn();
			debitTxn.setAmount(amount);
			debitTxn.setType(TxnType.DEBIT);
			debitTxn.setDate(new Date());
			debitTxn.setClosing_balance(fromAccount.getBalance());
			debitTxn.setAccount(fromAccount);

			Txn creditTxn = new Txn();
			creditTxn.setAmount(amount);
			creditTxn.setType(TxnType.CREDIT);
			creditTxn.setDate(new Date());
			creditTxn.setClosing_balance(toAccount.getBalance());
			creditTxn.setAccount(toAccount);

			txnRepopository.save(debitTxn);
			txnRepopository.save(creditTxn);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
