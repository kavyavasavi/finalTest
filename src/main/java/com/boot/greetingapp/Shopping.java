package com.boot.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Shopping {

	public static void main(String[] args) {
		SpringApplication.run(Shopping.class, args);
	}

	@GetMapping("/item1")
	public String item1() {
		return "Happy to show you a tv";
	}
	@GetMapping("/item2")
	public String item2() {
		return "happy to show you a fridge";
	}
	@GetMapping("/item3")
	public String item3() {
		return "happy ro show you a speaker";
	}

}
