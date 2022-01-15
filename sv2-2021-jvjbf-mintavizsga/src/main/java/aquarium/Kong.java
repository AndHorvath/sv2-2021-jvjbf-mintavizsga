package aquarium;

public class Kong extends Fish {

    // --- constructors -------------------------------------------------------

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    // --- public methods -----------------------------------------------------

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }

    @Override
    public void feed() {
        increaseWeight(2);
    }
}