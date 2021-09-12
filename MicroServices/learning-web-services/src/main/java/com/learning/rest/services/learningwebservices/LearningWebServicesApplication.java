package com.learning.rest.services.learningwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan("com.learning.rest.services.*")
@EnableJpaRepositories("com.learning.rest.services.respositories")
@EntityScan("com.learning.rest.services")

public class LearningWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningWebServicesApplication.class, args);
	}

}
