package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;

@Configuration
@EnableEurekaServer
@SpringBootApplication
@RestController
public class MicroserviceSimpleEurekaServer1030Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleEurekaServer1030Application.class, args);
	}
	
	@Autowired
	private EurekaClient eurekaClient;
	
	@ResponseBody
	@RequestMapping("/getinfo")
	public String getInfo(){
		EurekaClientConfig  config = eurekaClient.getEurekaClientConfig();
		String result = "info:"+config.toString();
		System.out.println(result);
		return result;
	}

}
