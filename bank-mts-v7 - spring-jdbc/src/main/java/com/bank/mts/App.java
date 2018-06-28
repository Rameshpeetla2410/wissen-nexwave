package com.bank.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.mts.config.Bank_mts;
import com.bank.mts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// Init phase
		// -----------------------------------------
		ConfigurableApplicationContext context = null; // container
		context = new AnnotationConfigApplicationContext(Bank_mts.class);
		// -----------------------------------------

		// use phase
		// -----------------------------------------
		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.txr(600.00, "2", "1");
		System.out.println("txr-success");
		// -----------------------------------------

		// destroy phase
		// -----------------------------------------
		context.close();
		// -----------------------------------------

	}

}
