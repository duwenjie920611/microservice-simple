package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.imp.UserFeignClient;
//import com.example.demo.imp.UserFeignClient;


@RestController
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class MicroserviceSimpleFeign1060Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleFeign1060Application.class, args);
	}
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	@RequestMapping("/get")
	@ResponseBody
	public String get() {
		return userFeignClient.get();
	}
	
	
	
	public String getBreakerInfo() {
		
		return "get breaker info";
	}
	
	
	
	
	

}
