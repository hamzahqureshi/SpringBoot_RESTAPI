package com.learning.springbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.learning.springbootrestapi.repository")
@EntityScan("com.learning.springbootrestapi")

public class SpringbootrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestapiApplication.class, args);
	}
}
