package com.basic01.basic01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class Basic01Application {
	@GetMapping("/")
	public String home() {
		return "Hello, Spring Boot!";
	}

	@GetMapping("/hello")
	public String getMethodName(@RequestParam String param) { // http://localhost:8080/hello?param=Dinesh
		return new String("Hello, " + param);
	}

	@GetMapping("/{name}")
	public String getMethodName2(@PathVariable String name) { // http://localhost:8080/Dinesh
		return new String("Hello, " + name);
	}

	public static void main(String[] args) {

		SpringApplication.run(Basic01Application.class, args);
	}

}
