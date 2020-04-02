package com.brasilPrev.desafio.BrasilPrev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class Clientes extends ResourceSupport {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
    @Column
	private String nome;
	@Column
	private String email;
	@Column
	private String senha;
	@Column
	private String rua;
	@Column
	private String bairro;
	@Column
	private String cep;
	@Column
	private String estado;
}
