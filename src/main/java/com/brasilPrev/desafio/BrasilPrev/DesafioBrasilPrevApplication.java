package com.brasilPrev.desafio.BrasilPrev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DesafioBrasilPrevApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBrasilPrevApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
