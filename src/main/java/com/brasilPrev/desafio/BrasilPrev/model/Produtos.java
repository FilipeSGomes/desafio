package com.brasilPrev.desafio.BrasilPrev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class Produtos extends ResourceSupport{

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	@Column
	private String nome;

//	@Column(name="CATEGORIA")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id", referencedColumnName = "codigo")
    private Categorias categorias;

	
}
