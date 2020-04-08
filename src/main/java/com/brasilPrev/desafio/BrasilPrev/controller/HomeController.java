package com.brasilPrev.desafio.BrasilPrev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping()
	public String form() {
		return "/index";

	}

	
	
}
