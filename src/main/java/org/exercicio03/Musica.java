package org.exercicio03;

public class Musica {
    private String titulo;
    private String artista;

    Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
