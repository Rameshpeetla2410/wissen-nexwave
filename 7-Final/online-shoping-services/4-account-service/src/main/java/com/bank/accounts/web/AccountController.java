package com.bank.accounts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.accounts.repository.AccountRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/api/accounts/{accounNum}")
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;

	@GetMapping(value = "/beneficiaries", produces = { "application/json" })
	public List<String> get() {
		return accountRepository.getBeneficiaries();
	}

}
