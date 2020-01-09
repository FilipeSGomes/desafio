package com.brasilPrev.desafio.BrasilPrev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.brasilPrev.desafio.BrasilPrev.Repository.UsuarioRepository;
import com.brasilPrev.desafio.BrasilPrev.model.Usuario;


@Repository
public class ComercialUserDetailsService implements UserDetailsService{

	@Autowired
	private UsuarioRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
		Usuario user = ur.findByNome(nome);
		
	    if (user == null) {
	      throw new UsernameNotFoundException("Usuário não encontrado!");
	    }
		return user;
	}
	

}
