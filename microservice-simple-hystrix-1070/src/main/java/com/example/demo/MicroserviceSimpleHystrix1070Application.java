package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.imp.UserFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@EnableFeignClients
@EnableCircuitBreaker
@RestController
@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceSimpleHystrix1070Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleHystrix1070Application.class, args);
	}
	
	@Autowired
	private UserFeignService userFeignService;
	
	@HystrixCommand(fallbackMethod = "getBreakInfo")
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	@ResponseBody
	public String getInfo(@RequestParam("name")String name,@RequestParam("age")String age)  {
		return "get info :\t" + userFeignService.get()+"-----" + "name:"+name+",age"+age;
	}
	
	public String getBreakInfo(String name ,String age) {
		return "the server is unavilable"+"name:"+name+",age"+age;
	}

}
