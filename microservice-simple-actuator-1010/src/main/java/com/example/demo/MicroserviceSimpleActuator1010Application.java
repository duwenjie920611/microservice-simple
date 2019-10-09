package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@SpringBootApplication
public class MicroserviceSimpleActuator1010Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleActuator1010Application.class, args);
	}
	
	
	@ResponseBody
	@RequestMapping("getActuator")
	public String getActuatorInfo() {
		
		return "actuator info";
	}

}
