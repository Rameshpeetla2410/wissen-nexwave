package com.bank.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.JdbcAccountRepository;
import com.bank.mts.service.TxrService;
import com.bank.mts.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// Init phase
		// -----------------------------------------
		ConfigurableApplicationContext context = null; // container
		context = new ClassPathXmlApplicationContext(new String[]{"bank-mts.xml","bank-infra.xml"});
		// -----------------------------------------

		System.out.println("-----------------------------------------");

		// use phase
		// -----------------------------------------
		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.txr(300.00, "1", "2");
		
		// -----------------------------------------

		System.out.println("-----------------------------------------");

		// destroy phase
		// -----------------------------------------
		context.close();
		// -----------------------------------------

	}

}
