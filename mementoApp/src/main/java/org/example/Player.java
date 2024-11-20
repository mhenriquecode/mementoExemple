package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Player { // Caretaker
    private final List<Memento> positionMemory = new ArrayList<>(); // Pilha de estados salvos
    private final Piece piece = new Piece();

    public void goForward() {
        int n = new Random().nextInt(6) + 1;
        piece.move(n);
    }

    public void saveState() {
        positionMemory.add(piece.createMemento()); // Salva o estado atual
        System.out.println("Estado salvo com sucesso!");
    }

    public void undo() {
        if (!positionMemory.isEmpty()) {
            Memento lastMemento = positionMemory.removeLast(); // Remove o último estado salvo
            piece.restoreState(lastMemento); // Restaura o estado da peça
        } else {
            System.out.println("Nenhum estado para restaurar.");
        }
    }
}
