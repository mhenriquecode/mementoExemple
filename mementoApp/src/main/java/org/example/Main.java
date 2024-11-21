package org.example;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Realizando movimentos...");
        player.goForward();
        player.goForward();

        System.out.println("\nSalvando estado...");
        player.saveState();

        player.goForward();
        player.goForward();

        System.out.println("\nSalvando estado...");
        player.saveState();
        player.goForward();


        System.out.println("\nRestaurando estado salvo...");
        player.checkPoint();


        System.out.println("\nContinuando o jogo...");
        player.goForward();


        System.out.println("\nRestaurando mais uma vez...");
        player.checkPoint();

        System.out.println("\nTentando restaurar mais uma vez...");
        player.checkPoint();

        System.out.println("\nJogo finalizado.");
    }
}