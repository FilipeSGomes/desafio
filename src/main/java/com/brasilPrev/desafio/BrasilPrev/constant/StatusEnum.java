package com.brasilPrev.desafio.BrasilPrev.constant;

public enum StatusEnum {

	ANDAMENTO("Em andamento",0), 
	CONCLUIDO("Concluido",1), 
	PAGO("Pago",2);
	
	
	private final String nome;
	private final int index;

	private StatusEnum(String nome, int index) {
		this.nome  = nome;
		this.index = index;
	}
	
	public String getNome() {
		return nome;
	}
}
