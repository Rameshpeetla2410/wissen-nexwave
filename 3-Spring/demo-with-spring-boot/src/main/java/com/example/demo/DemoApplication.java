package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.outside.config.MyAutoConfig;

//@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(MyAutoConfig config) {
		return args -> {
			System.out.println(config.isFeatureEnabled());
		};
	}
} 
