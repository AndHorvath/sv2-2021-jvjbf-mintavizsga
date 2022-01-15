package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    // --- public methods -----------------------------------------------------

    public List<Character> getUniqueChars(String text) {
        validateParameter(text);

        List<Character> characterList = new ArrayList<>();
        for (Character character : text.toCharArray()) {
            if (!characterList.contains(character)) {
                characterList.add(character);
            }
        }
        return characterList;
    }

    // --- private methods ----------------------------------------------------

    private void validateParameter(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text is null.");
        }
    }
}