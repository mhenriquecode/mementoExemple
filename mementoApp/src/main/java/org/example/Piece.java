package org.example;

class Piece { // Originator
    private int cell = 0;

    public void move(int n) {
        cell += n;
        System.out.println("Movendo para a posição: " + cell);
    }

    public Memento createMemento() {
        System.out.println("Posição atual: " + cell);
        return new Memento(cell);
    }

    public void restoreState(Memento memento) {
        this.cell = memento.getState();
        System.out.println("Estado restaurado para a posição: " + cell);
    }
}
