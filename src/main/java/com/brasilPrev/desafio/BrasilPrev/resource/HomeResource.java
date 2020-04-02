package com.brasilPrev.desafio.BrasilPrev.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "API REST Produto")
@RestController
@RequestMapping("/")
public class HomeResource {

	@GetMapping()
	public String form() {
		return "/index";

	}

	
	
}
