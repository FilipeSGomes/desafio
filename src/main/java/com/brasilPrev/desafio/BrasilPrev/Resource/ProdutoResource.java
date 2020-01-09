package com.brasilPrev.desafio.BrasilPrev.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Produto")
@RestController
@RequestMapping("/prev")
public class ProdutoResource {

	@ApiOperation(value="retorna todos os produtos cadastrados")
	@GetMapping(produces = "application/json") 
	public @ResponseBody String findProdutos(){
		return "Oi Amor Minha Vidinha";
	}
	
	
}
