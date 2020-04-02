package com.brasilPrev.desafio.BrasilPrev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAsync
public class DesafioBrasilPrevApplication extends org.springframework.boot.web.support.SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DesafioBrasilPrevApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioBrasilPrevApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins(CrossOrigin.DEFAULT_ORIGINS)
						.allowedHeaders(CrossOrigin.DEFAULT_ALLOWED_HEADERS)
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
						.allowCredentials(CrossOrigin.DEFAULT_ALLOW_CREDENTIALS).maxAge(3600);
			}
		};
	}
}
