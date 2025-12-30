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


		// This is when we used constructor injection
		// Computer obj1 = new Desktop();
		// Dev2 dev = new Dev2(obj1);
		// dev.execute();

		// And this is where we used setter injection
		Computer laptop = new Laptop();
		Dev2 dev1 = new Dev2();
		dev1.setC(laptop);
		dev1.execute();
		
	}

}
