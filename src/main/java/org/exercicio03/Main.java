package org.exercicio03;

public class Main {
    public static void main(String[] args) {

        MusicCloud musicCloud = new MusicCloud();
        String[] musicasNomes = {"Yesterday", "When The Levee Breaks", "It Ain't Easy", "Echoes"};
        String[] musicasArtistas = {"The Beatles", "Led Zeppelin", "David Bowie", "Pink Floyd"};

        for (int i = 0; i < 4; i++) {
            Musica m = new Musica(
                    musicasNomes[i],
                    musicasArtistas[i]
            );
            musicCloud.adicionarMusica(m);
        }

        System.out.println(musicCloud.getMusicasDisponiveis());
    }
}