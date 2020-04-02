package com.brasilPrev.desafio.BrasilPrev.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.hateoas.ResourceSupport;

import com.brasilPrev.desafio.BrasilPrev.constant.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class Pedidos extends ResourceSupport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	@Column(name = "DS_NOME")
	private String nome;

	@Column
	private LocalDate data;
	
	@Column
	private StatusEnum status;
	
	@Column
	private String sessao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Clientes cliente;
}
