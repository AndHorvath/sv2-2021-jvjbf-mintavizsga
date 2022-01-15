package aquarium;

public class Tang extends Fish {

    // --- constructors -------------------------------------------------------

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    // --- public methods -----------------------------------------------------

    @Override
    public boolean hasMemoryLoss() {
        return true;
    }

    @Override
    public void feed() {
        increaseWeight(1);
    }
}