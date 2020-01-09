package com.brasilPrev.desafio.BrasilPrev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brasilPrev.desafio.BrasilPrev.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

	public Usuario findByNome(String nome);
}
