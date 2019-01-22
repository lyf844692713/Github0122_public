package com.lyf0122.demo0122;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo0122Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo0122Application.class, args);
	}

	@RequestMapping("/hlloo")
	public String hello(){
		System.out.println("masert4");
		return "hello";
	}
	

}

