package com.cts.demoMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class DemoMicroservicesApplication {

	@RequestMapping("/")
	public String hello(){
		
		return "hello";
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoMicroservicesApplication.class, args);
	}

}
