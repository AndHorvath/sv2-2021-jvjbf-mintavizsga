package aquarium;

public class Clownfish extends Fish {

    // --- constructors -------------------------------------------------------

    public Clownfish(String name, int weight, String colour) {
        super(name, weight, colour);
    }

    // --- public methods -----------------------------------------------------

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }

    @Override
    public void feed() {
        increaseWeight(1);
    }
}