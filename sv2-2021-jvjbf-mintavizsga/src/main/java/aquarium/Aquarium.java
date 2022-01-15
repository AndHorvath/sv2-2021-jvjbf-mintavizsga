package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    // --- attributes ---------------------------------------------------------

    public static final int CAPACITY = 20;
    public static final int NEEDED_CAPACITY_PRO_FISH = 5;
    private List<Fish> fishList;

    // --- constructors -------------------------------------------------------

    public Aquarium() {
        fishList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Fish> getFishList() { return fishList; }

    // --- public methods -----------------------------------------------------

    public void addFish(Fish fish) {
        if ((fishList.size() + 1) * NEEDED_CAPACITY_PRO_FISH > CAPACITY) {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        fishList.add(fish);
    }

    public void feed() {
        for (Fish fish : fishList) {
            fish.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> fishToRemove = new ArrayList<>();
        for (Fish fish : fishList) {
            if (fish.getWeight() > maxWeight) {
                fishToRemove.add(fish);
            }
        }
        fishList.removeAll(fishToRemove);
    }

    public List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Fish fish : fishList) {
            statusList.add(fish.getStatus());
        }
        return statusList;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int numberOfFishWithMemoryLoss = 0;
        for (Fish fish : fishList) {
            if (fish.hasMemoryLoss()) {
                numberOfFishWithMemoryLoss++;
            }
        }
        return numberOfFishWithMemoryLoss;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish fish : fishList) {
            if (fish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallestFish = null;
        for (Fish fish : fishList) {
            if (smallestFish == null || fish.getWeight() < smallestFish.getWeight()) {
                smallestFish = fish;
            }
        }
        return smallestFish;
    }
}