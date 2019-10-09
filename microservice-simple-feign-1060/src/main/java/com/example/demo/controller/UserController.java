package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.imp.UserManuallyFeignClient;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;

@Import(FeignClientsConfiguration.class)
@RestController
public class UserController {
	
	
	private UserManuallyFeignClient userManuallyFeignClient;
	
	@Autowired
	public UserController() {
		this.userManuallyFeignClient = Feign.builder()
//				.client(client)
//				.decoder(decoder)
//				.encoder(encoder)
				.requestInterceptor(new BasicAuthRequestInterceptor("user", "passwd"))
				.target(UserManuallyFeignClient.class, "http://127.0.0.1:1040");
	}

	@RequestMapping(value ="/getInfo",method=RequestMethod.GET)
	@ResponseBody
	public String getInfo() {
		return this.userManuallyFeignClient.get();
	}
	
}
