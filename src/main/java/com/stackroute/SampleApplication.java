package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {
	@GetMapping("/message")
	public String getMessage(){
		return "Working";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
