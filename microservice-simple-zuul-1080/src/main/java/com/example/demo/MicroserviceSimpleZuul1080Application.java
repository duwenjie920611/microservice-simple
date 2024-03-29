package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableZuulProxy
@SpringBootApplication
public class MicroserviceSimpleZuul1080Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleZuul1080Application.class, args);
	}
	
	
	

}
