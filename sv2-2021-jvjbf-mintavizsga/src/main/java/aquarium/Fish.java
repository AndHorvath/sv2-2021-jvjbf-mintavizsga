package aquarium;

public abstract class Fish {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int weight;
    private String color;

    // --- constructors -------------------------------------------------------

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getWeight() { return weight; }
    public String getColor() { return color; }

    // --- public methods -----------------------------------------------------

    public abstract boolean hasMemoryLoss();

    public abstract void feed();

    public String getStatus() {
        return
            name + ", weight: " + weight +
            ", color: " + color + ", short-term memory loss: " + hasMemoryLoss();
    }

    public void increaseWeight(int weight) {
        this.weight += weight;
    }
}