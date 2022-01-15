package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {

    // --- attributes ---------------------------------------------------------

    private List<String> owlsInCounties;

    // --- constructors -------------------------------------------------------

    public OwlCounter() {
        this.owlsInCounties = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getOwlsInCounties() {
        return owlsInCounties;
    }

    // --- public methods -----------------------------------------------------

    public void readFromFile(Path path) {
        try {
            owlsInCounties = Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Can not read file.", exception);
        }
    }

    public int getNumberOfOwls(String county) {
        for (String owlsInCounty : owlsInCounties) {
            String[] owlsInCountyArray = getOwlsInCountyArray(owlsInCounty);
            if (owlsInCountyArray[0].equals(county)) {
                return Integer.parseInt(owlsInCountyArray[1]);
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int numberOfAllOwls = 0;
        for (String owlsInCounty : owlsInCounties) {
            numberOfAllOwls += Integer.parseInt(getOwlsInCountyArray(owlsInCounty)[1]);
        }
        return numberOfAllOwls;
    }

    // --- private methods ----------------------------------------------------

    private String[] getOwlsInCountyArray(String owlsInCounty) {
        return owlsInCounty.split("=");
    }
}