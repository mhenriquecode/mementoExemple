public class Main {
    public static void main(String[] args) {
        // Criação do Caretaker
        Player player = new Player();

        System.out.println("Realizando movimentos...");
        player.goForward();
        player.goForward();

        System.out.println("\nSalvando estado...");
        player.saveState();

        player.goForward();
        player.goForward();
        player.goForward();


        System.out.println("\nRestaurando estado salvo...");
        player.restore();


        System.out.println("\nContinuando o jogo...");
        player.goForward();

        System.out.println("\nTentando restaurar mais uma vez...");
        player.restore();

        System.out.println("\nJogo finalizado.");
    }
}