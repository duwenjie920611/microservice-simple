package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceSimpleConfigServer1090Application {

	public static void main(String[] args) {
        Integer a = Integer.valueOf(1);
        Integer b = 1;
        System.out.println(a==b);
        System.out.println(a.intValue()==b.intValue());
        EnvironmentRepository er;
		SpringApplication.run(MicroserviceSimpleConfigServer1090Application.class, args);
	}

}
