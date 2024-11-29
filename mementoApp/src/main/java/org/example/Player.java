package org.example;
import java.util.Random;
import java.util.Stack;


class Player { // Caretaker
    private final Stack<Memento> positionMemory = new Stack<>();
    private final Piece piece = new Piece();

    public void goForward() {
        int n = new Random().nextInt(6) + 1;
        piece.move(n);
    }

    public void goBack(){
        int n = -1 * (new Random().nextInt(6) + 1);
        piece.move(n);
    }

    public void saveState() {
        positionMemory.push(piece.createMemento());
        System.out.println("Estado salvo com sucesso!");
    }

    public void checkPoint() {
        if (!positionMemory.isEmpty()) {
            Memento lastMemento = positionMemory.pop();
            piece.restoreState(lastMemento);
        } else {
            System.out.println("Nenhum estado para restaurar.");
        }
    }
}
