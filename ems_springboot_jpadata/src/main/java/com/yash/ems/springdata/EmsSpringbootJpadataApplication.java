package com.yash.ems.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan

@EntityScan(basePackages = {"com.yash.ems.model"})
@SpringBootApplication
public class EmsSpringbootJpadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsSpringbootJpadataApplication.class, args);
	}

}
