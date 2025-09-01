package org.exercicio02;

import java.util.ArrayList;

public class BasePorto {
    private String nome;
    ArrayList<Barco> barcosAtracados = new ArrayList<Barco>();

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
    }
}
