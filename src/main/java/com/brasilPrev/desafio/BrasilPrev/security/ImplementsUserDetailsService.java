package com.brasilPrev.desafio.BrasilPrev.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.brasilPrev.desafio.BrasilPrev.model.Usuario;
import com.brasilPrev.desafio.BrasilPrev.repository.UsuarioRepository;


@Repository
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
		Usuario user = usuarioRepository.findByNome(nome);
		System.out.println(user.getPassword());
		System.out.println(user.getUsername());
	    if (user == null) {
	      throw new UsernameNotFoundException("Usuário não encontrado!");
	    }
		return user;
	}

}