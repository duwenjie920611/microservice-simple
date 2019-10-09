package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MicroserviceSimpleConfigClient1100Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleConfigClient1100Application.class, args);
	}
	
//	@Autowired
//	PropertySource ps;
	
//	@Value("${key}")
//	String key;
//	
    @RequestMapping("/get")
    public String home() {
        return "Hello World!";
    }
    
    
//    @Bean
//    public PropertySource getInstance() {
//    	return new PropertySource(null, null);
//    }

}
