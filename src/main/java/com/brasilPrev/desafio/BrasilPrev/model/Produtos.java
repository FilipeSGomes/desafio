package com.brasilPrev.desafio.BrasilPrev.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Produtos extends ResourceSupport{

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	private String nome;

//	@Column(name="CATEGORIA")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id", referencedColumnName = "codigo")
    private Categorias categorias;

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

	public Categorias getCategoria() {
		return categorias;
	}

	public void setCategoria(Categorias categoria) {
		this.categorias = categoria;
	}

	public Produtos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produtos(long codigo, String nome, Categorias categoria) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.categorias = categoria;
	}

	@Override
	public String toString() {
		return "Produtos [codigo=" + codigo + ", nome=" + nome + ", categoria=" + categorias + "]";
	}
	
}
