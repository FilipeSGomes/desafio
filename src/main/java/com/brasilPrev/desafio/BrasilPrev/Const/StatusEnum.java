package com.brasilPrev.desafio.BrasilPrev.Const;

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

	
	public static StatusEnum getEnum(int index){
		
		for(StatusEnum p : StatusEnum.values()){
			if(p.index == index)return p;
		}
		throw new IllegalArgumentException("Valor do enum StatusEnum não encontrado.");
	}
	
	public String getNome() {
		return nome;
	}
}
