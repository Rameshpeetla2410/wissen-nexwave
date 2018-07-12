package com.bank.accounts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.accounts.model.Txn;
import com.bank.accounts.repository.TxnRepopository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/api/txns")
public class TxnController {

	@Autowired
	private TxnRepopository txnRepopository; 
	
	@GetMapping(params= {"size"})
	public List<Txn> get(@RequestParam int size) {
		return txnRepopository.findAll();
	}
	
}
