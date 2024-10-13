package com.AttandanceManagementSystem.attandanceSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class AttandanceSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttandanceSystemApplication.class, args);
	}

}
