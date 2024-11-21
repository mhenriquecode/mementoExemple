import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Player { // Caretaker
    private final List<Memento> positionMemory = new ArrayList<>();
    private final Piece piece = new Piece();

    public void goForward() {
        int n = new Random().nextInt(6) + 1;
        piece.move(n);
    }

    public void saveState() {
        positionMemory.add(piece.createMemento());
        System.out.println("Estado salvo com sucesso!");
    }

    public void restore() {
        if (!positionMemory.isEmpty()) {
            Memento lastMemento = positionMemory.removeLast();
            piece.restoreState(lastMemento);
        } else {
            System.out.println("Nenhum estado para restaurar.");
        }
    }
}
