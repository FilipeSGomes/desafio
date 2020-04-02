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

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Pedidos extends ResourceSupport{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	@Column(name = "DS_NOME")
	private String nome;

	private LocalDate data;

	private StatusEnum status;
	
	private String sessao;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private Clientes cliente;

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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}

	public Pedidos(long codigo, String nome, LocalDate data, StatusEnum status, String sessao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.data = data;
		this.status = status;
		this.sessao = sessao;
	}

	public Pedidos() {
		super();
	}
	

}
