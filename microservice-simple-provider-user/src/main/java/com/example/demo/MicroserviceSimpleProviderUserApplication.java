package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@SpringBootApplication
public class MicroserviceSimpleProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
	}
	
	
	
//	@Bean
//	public ApplicationRunner init(UserDao userDao) {
//		
//		return args -> {
//			User usera = new User();
//			usera.setId("1");
//			
//			User userb = new User();
//			userb.setId("2");
//			
//			Stream.of(userb,userb).forEach(action);
//			
//		};
//		
//	}
	
	
	
	
	

}
