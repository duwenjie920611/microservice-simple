package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@EnableEurekaClient
@SpringBootApplication
public class MicroserviceSimpleEurekaClient1040Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleEurekaClient1040Application.class, args);
	}
	
	
	@ResponseBody
	@RequestMapping("/getInfo")
	public String getInfo(HttpServletRequest request) {
		System.out.println("+++++++++++++++++++++++++++++++++ get");
		return request.getRequestURL()+" port "+ request.getRemotePort() +" ,hello";
		
	}
	
	
	@ResponseBody
	@RequestMapping("/get")
	public String getInfo() {

		return restTemplate.getForObject("http://microservice-simple-eureka-clinet-1040/getInfo", String.class);
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

}
