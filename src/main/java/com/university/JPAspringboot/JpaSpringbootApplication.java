package com.university.JPAspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class JpaSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSpringbootApplication.class, args);
		System.out.println("hello word"+ SpringVersion.getVersion());

	}

}
