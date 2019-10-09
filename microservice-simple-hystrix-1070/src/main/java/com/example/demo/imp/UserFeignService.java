package com.example.demo.imp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import feign.hystrix.FallbackFactory;

@FeignClient(contextId = "userFeignService",name="microservice-simple-eureka-clinet-1040")
public interface UserFeignService {

	@GetMapping("/getInfo")
	public String get();
}


