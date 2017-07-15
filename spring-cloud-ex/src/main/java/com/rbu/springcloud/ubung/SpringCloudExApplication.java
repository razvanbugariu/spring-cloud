package com.rbu.springcloud.ubung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExApplication.class, args);
	}

	@GetMapping(value = "/values")
	public String getValues() {
		return "Hello Spring Cloud!";
	}

}
