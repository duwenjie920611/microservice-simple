package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class MicroserviceHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHelloWorldApplication.class, args);
	}
	

}
