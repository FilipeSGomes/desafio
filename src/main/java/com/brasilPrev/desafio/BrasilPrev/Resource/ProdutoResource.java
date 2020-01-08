package com.brasilPrev.desafio.BrasilPrev.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brasilPrev.desafio.BrasilPrev.model.Categorias;

import io.swagger.annotations.ApiOperation;

//@Api(value = "API REST Produto")
@RestController
@RequestMapping("/prev")
public class ProdutoResource {

	@ApiOperation(value="retorna todos os produtos cadastrados")
	@GetMapping(produces = "application/json")
	public @ResponseBody Categorias findProdutos(){
		Categorias prod = new Categorias();
		return prod;
	}
	
	
}
