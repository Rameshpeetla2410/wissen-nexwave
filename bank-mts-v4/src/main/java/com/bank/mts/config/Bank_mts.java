package com.bank.mts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { Bank_infra.class })
@ComponentScan(basePackages = { "com.bank.mts" })
public class Bank_mts {

}
