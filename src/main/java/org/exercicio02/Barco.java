package org.exercicio02;

public class Barco {
    private String nome;
    private int tamanho;

    Barco(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return this.tamanho;
    }
}
