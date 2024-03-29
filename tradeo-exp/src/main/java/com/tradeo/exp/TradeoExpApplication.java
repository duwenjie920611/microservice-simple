package com.tradeo.exp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement 
@EnableScheduling
@SpringBootApplication
public class TradeoExpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeoExpApplication.class, args);
	}

}
