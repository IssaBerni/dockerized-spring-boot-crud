package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This annotation enables Spring Boot's auto-configuration and component scanning
public class DemoApplication {

    // Main method, the entry point of the Spring Boot application
	public static void main(String[] args) {
	    // Print "hello world" to the console (useful for checking that the application starts)
		System.out.println("hello world");
		
		// Run the Spring Boot application. It will start an embedded web server (like Tomcat) and initialize the application context.
		SpringApplication.run(DemoApplication.class, args);
	}

}
