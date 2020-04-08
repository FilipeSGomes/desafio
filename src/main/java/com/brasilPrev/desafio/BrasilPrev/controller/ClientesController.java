package com.brasilPrev.desafio.BrasilPrev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brasilPrev.desafio.BrasilPrev.model.Clientes;
import com.brasilPrev.desafio.BrasilPrev.repository.ClientesRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Produto")
@RestController
@RequestMapping("/prev/cliente")
public class ClientesController {

	@Autowired
	ClientesRepository repository;

	@ApiOperation(value = "retorna todas categorias cadastrados")
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Clientes> findProdutos() {
		Iterable<Clientes> clientes = repository.findAll();
		return clientes;
	}
}
