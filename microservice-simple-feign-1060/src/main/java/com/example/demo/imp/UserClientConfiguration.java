package com.example.demo.imp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class UserClientConfiguration {
	
	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return new BasicAuthRequestInterceptor("user", "passwd");
	}

}
