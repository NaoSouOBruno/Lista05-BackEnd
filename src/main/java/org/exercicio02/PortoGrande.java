package org.exercicio02;

public class PortoGrande extends BasePorto {
    @Override
    public void atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            atracarBarco(barco);
        } else {
            System.out.println("Barco não atracado! Tamanho máximo excedido.");
        }
    }
}
