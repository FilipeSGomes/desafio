package com.brasilPrev.desafio.BrasilPrev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brasilPrev.desafio.BrasilPrev.model.Pedidos;
import com.brasilPrev.desafio.BrasilPrev.repository.PedidosRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Produto")
@RestController
@RequestMapping("/prev/pedido")
public class PedidosController {
	
	@Autowired
	PedidosRepository repository;
	
	@ApiOperation(value="retorna todos os pedidos cadastrados")
	@GetMapping(produces = "application/json") 
	public @ResponseBody Iterable<Pedidos> findProdutos(){
		Iterable<Pedidos> pedidos = repository.findAll(); 
		return pedidos;
	}
	
}
