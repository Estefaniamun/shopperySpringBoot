package com.example.shoppery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
@SpringBootApplication (scanBasePackages= {"com.example.shoppery"})
@EntityScan (basePackages= {"com.example.shoppery.*"})
@ServletComponentScan


public class ShoperryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoperryApplication.class, args);
	}

}
