package com.brasilPrev.desafio.BrasilPrev.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brasilPrev.desafio.BrasilPrev.Repository.PedidosRepository;
import com.brasilPrev.desafio.BrasilPrev.model.Pedidos;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Produto")
@RestController
@RequestMapping("/prev/pedido")
public class PedidosResource {
	
	@Autowired
	PedidosRepository repository;
	
	@ApiOperation(value="retorna todos os pedidos cadastrados")
	@GetMapping(produces = "application/json") 
	public @ResponseBody Iterable<Pedidos> findProdutos(){
		Iterable<Pedidos> pedidos = repository.findAll(); 
		return pedidos;
	}
	
}
