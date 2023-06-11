package com.example.shoppery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class},
scanBasePackages= {"com.example.shoppery.something", "com.example.application"})
public class ShoperryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoperryApplication.class, args);
	}

}
