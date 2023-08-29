package com.rto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtoApplication.class, args);
	}

}
