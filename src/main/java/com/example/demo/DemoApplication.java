package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// this line of code is responsible for creating that spring 
		// cotainer that contains my objects and manages them
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// this code is to implement DI using spring 
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
