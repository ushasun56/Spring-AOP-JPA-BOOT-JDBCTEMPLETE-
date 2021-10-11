package com.yash.ems.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EntityScan(basePackages = {"com.yash.ems.model"})
public class EmsSpringbootJpadata2Application {

	public static void main(String[] args) {
		SpringApplication.run(EmsSpringbootJpadata2Application.class, args);
	}

}
