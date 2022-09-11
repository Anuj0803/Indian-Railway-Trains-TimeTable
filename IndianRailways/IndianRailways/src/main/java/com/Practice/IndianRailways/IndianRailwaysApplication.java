package com.Practice.IndianRailways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IndianRailwaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndianRailwaysApplication.class, args);
	}

}
