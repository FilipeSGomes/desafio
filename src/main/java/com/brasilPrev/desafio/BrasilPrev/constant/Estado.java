package com.brasilPrev.desafio.BrasilPrev.constant;

public enum Estado {

    FEITO(0, "Feito"),
    PENDENTE(1, "Pendente");


    private final int index;
    private final String nome;


    Estado(int index, String nome) {
        this.index = index;
        this.nome = nome;
    }

    public int getIndex() {
        return index;
    }

    public String getNome() {
        return nome;
    }
}
