package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MicroserviceSimpleLogging1000Application {
	
	private Log log = LogFactory.getLog(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleLogging1000Application.class, args);
	}
	
	@RequestMapping("/getLogger")
	@ResponseBody
	public String getLogger(){
		log.debug("debug info");
		log.info("info info");
		log.warn("warm info");
		log.error("error info");
		log.fatal("fatal info");
		return "logger.info";
	}

}
