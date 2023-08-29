package com.rto.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	
		public SwaggerConfig() {
			System.out.println("SwaggerConfig.SwaggerConfig()");
		}
		
		@Bean
		public Docket api() {                
		    return new Docket(DocumentationType.SWAGGER_2)          
		      .select()
		      .apis(RequestHandlerSelectors.basePackage("com.rto.rest"))
		      .paths(PathSelectors.ant("/*"))
		      .build()
		      .apiInfo(apiInfo());
		}
		private ApiInfo apiInfo() {
		    return new ApiInfo(
		      "My REST API", 
		      "First Rest with Swagger", 
		      "API Rest", 
		      "Terms of service", 
		      new Contact("abhi", "www.example.ooo", "abhi@gmail.com"), 
		      "License of API", "API license URL", Collections.emptyList());
		}

	}


