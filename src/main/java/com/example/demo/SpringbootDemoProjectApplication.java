package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api")
@RestController
@SpringBootApplication
public class SpringbootDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoProjectApplication.class, args);
	}
	@GetMapping("/hello")
	public String getMessage(){
	return "Hello welcome.......";
	}
}
