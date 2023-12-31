package com.abc.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class AbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcApplication.class, args);	

	}

	@GetMapping("/")
    public String print() {
        return "This page is first...";
    }
	@GetMapping("/hello")
    public String hello() {
        return "Hello, World!  welcome";
    }
	@GetMapping("/diplay")
    public String display() {
        return "Hello, World!  This is Display page";
    }

}
