package com.example.demo.imp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

//@Component
@FeignClient(contextId = "userFeignClient",name="microservice-simple-eureka-clinet-1040",configuration = UserClientConfiguration.class)
public interface UserFeignClient {
	
	@GetMapping("/getInfo")
	String get();

}
