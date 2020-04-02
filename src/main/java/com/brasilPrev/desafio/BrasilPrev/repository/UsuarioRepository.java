package com.brasilPrev.desafio.BrasilPrev.repository;

import org.springframework.data.repository.CrudRepository;

import com.brasilPrev.desafio.BrasilPrev.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	public Usuario findByNome(String nome);
}
