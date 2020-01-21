package com.brasilPrev.desafio.BrasilPrev;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.brasilPrev.desafio.BrasilPrev"))
//	                .paths(regex("/prev.*"))
	                .build()
	                .apiInfo(metaInfo());
	    }

		private ApiInfo metaInfo() {

	        ApiInfo apiInfo = new ApiInfo(
	                "Spring Boot Swagger Desafio Brasil Prev",
	                "Spring Boot Swagger Desafio Brasil tes",
	                "1.0",
	                "Terms of Service",
	                new Contact("Filipe Gomes", "https://github.com/FilipeSGomes/desafio_brasilPrev",
	                        "filipesan7@gmail.com"),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licesen.html", 
	                new ArrayList<VendorExtension>() 
	        );

	        return apiInfo;
	    }
	}
