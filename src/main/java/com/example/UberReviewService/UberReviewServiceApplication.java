package com.example.UberReviewService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // it is used to enable the JPA Auditing feature in the application

public class UberReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberReviewServiceApplication.class, args);
	}
}
