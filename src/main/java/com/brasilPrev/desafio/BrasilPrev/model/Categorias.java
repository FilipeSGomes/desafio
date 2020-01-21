package com.brasilPrev.desafio.BrasilPrev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = false)
@Entity
public class Categorias extends ResourceSupport{

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	private String nome;

//	@OneToMany(fetch=FetchType.EAGER)
//    private Produtos produto;
	
	@Override
	public String toString() {
		return "Categorias [codigo=" + codigo + ", nome=" + nome + "]";
	}

	public Categorias(long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Categorias() {
	}
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
