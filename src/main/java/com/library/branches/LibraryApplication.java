package com.library.branches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@RefreshScope
@EnableEurekaClient
@EnableCircuitBreaker
public class LibraryApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
}
