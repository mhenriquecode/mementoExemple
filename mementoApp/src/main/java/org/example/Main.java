package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criação do Player (Caretaker)
        Player player = new Player();

        // Movimentos iniciais
        System.out.println("Realizando movimentos...");
        player.goForward();
        player.goForward();


        System.out.println("\nSalvando estado...");
        player.saveState();

        // Mais movimentos
        player.goForward();
        player.goForward();
        player.goForward();

        // Restaurar o estado anterior
        System.out.println("\nRestaurando estado salvo...");
        player.undo();

        // Continuar jogando
        System.out.println("\nContinuando o jogo...");
        player.goForward();

        // Restaurar mais uma vez (se houver estados salvos)
        System.out.println("\nTentando restaurar mais uma vez...");
        player.undo();

        // Finalizar
        System.out.println("\nJogo finalizado.");
    }
}