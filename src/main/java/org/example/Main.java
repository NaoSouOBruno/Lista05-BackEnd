package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();

        List<Personagem> inimigos = new ArrayList<Personagem>();

        inimigos.add(new Personagem("Zumbi", 15, 5));
        inimigos.add(new Personagem("Esqueleto", 10, 7));
        inimigos.add(new Personagem("Creeper", 5, 10));

        Personagem jogador = new Personagem("Steve", 900, 10);

        int round = 1;

        while(jogador.getVida() > 0 || !inimigos.isEmpty()) {

            System.out.println("\nRound n° " + round + "\n-----------------------------");
            int alvoAleatorio = r.nextInt(inimigos.size());
            jogador.atacar(inimigos.get(alvoAleatorio));

            if (inimigos.get(alvoAleatorio).getVida() <= 0) {
                inimigos.remove(alvoAleatorio);
            }

            System.out.println(" ");

            for (int i = 0; i < inimigos.size(); i++) {
                inimigos.get(i).atacar(jogador);
            }
            TimeUnit.SECONDS.sleep(4);

            if (inimigos.isEmpty()) {
                System.out.println("\n=============================\n" + jogador.getNome() + " venceu!\n=============================");
                break;
            }
            if (jogador.getVida() <= 0) {
                System.out.println("\n=============================\n" + jogador.getNome() + " perdeu!\n=============================");
                break;
            }
            round++;

        }
    };
}
