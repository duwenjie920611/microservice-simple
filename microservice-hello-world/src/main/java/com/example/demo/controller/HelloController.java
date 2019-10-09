package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/hello.ii")
	@ResponseBody
	public String init(){
		System.out.println("request -- info");
		
		return "hello world";
	}
	
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public String getUserInfo(){
		System.out.println("----------------");
		return this.restTemplate.getForObject("http://127.0.0.1:8080/get/1", String.class);
	}
	
	

}
