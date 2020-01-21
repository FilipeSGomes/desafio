package com.brasilPrev.desafio.BrasilPrev.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brasilPrev.desafio.BrasilPrev.Repository.UsuarioRepository;
import com.brasilPrev.desafio.BrasilPrev.model.Usuario;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Produto")
@RestController
@RequestMapping("/prev/login")

public class UsuarioResources {

	@Autowired
	UsuarioRepository repository;

	@ApiOperation(value = "retorna todos os usuarios cadastrados")
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Usuario> findProdutos() {
		Iterable<Usuario> usuarios = repository.findAll();
		return usuarios;
	}

}
