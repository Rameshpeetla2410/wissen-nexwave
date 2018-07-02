package com.bank.mts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "com.bank.mts.web" })
public class Bank_Web_mts {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver vrr = new InternalResourceViewResolver();
		vrr.setPrefix("/");
		vrr.setSuffix(".jsp");
		return vrr;
	}

}
