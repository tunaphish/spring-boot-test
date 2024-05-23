package com.tunaphish.test.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/messages")
	public String getMessage() {
		return "Hello from Docker!";
	}


	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
