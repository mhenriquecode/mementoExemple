package org.example;

class Memento {
    private final int state; // (posição da peça)

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
