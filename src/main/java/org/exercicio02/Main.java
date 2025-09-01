package org.exercicio02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PortoGrande portoGrande = new PortoGrande();
        PortoPequeno portoPequeno = new PortoPequeno();

        ArrayList<Barco> listaBarcos = new ArrayList<Barco>();
        listaBarcos.add(new Barco("Vermelho", 12));
        listaBarcos.add(new Barco("Azul", 8));
        listaBarcos.add(new Barco("Verde", 13));
        listaBarcos.add(new Barco("Amarelo", 10));
        listaBarcos.add(new Barco("Rosa", 9));

        for (int i = 0; i < listaBarcos.size(); i++) {
            try {
                portoPequeno.atracarBarco(listaBarcos.get(i));
            } catch (exception e) {

            }

        }
    }
}
