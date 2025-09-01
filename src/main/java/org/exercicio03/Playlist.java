package org.exercicio03;

public class Playlist {
    private String nome;
    private String musicas;

    Playlist(String nome, String musicas) {
        this.nome = nome;
        this.musicas = musicas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
