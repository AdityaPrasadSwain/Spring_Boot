package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyEnjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyEnjectionApplication.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c = applicationContext.getBean("car", Car.class);
		c.drive();
		
		
	}

}
