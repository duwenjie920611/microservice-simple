package com.example.demo.imp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import feign.RequestLine;
@FeignClient(contextId = "userManuallyFeignClient",name="microservice-simple-eureka-clinet-1040")
public interface UserManuallyFeignClient {
	
	@RequestLine("GET /getInfo")
	String get();
	
	@GetMapping("/getInfo")
	String getInfo();

}
