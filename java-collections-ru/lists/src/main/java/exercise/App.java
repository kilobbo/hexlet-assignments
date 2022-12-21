package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        word = word.toLowerCase();
        List<String> symbolsList = new ArrayList<>();

        for (var i = 1; i <= symbols.length(); i++) {
            symbolsList.add(symbols.substring(i - 1, i));
        }

        for (var i = 1; i <= word.length(); i++) {
            if (!symbolsList.contains(word.substring(i - 1, i))) {
                return false;
            } else {
                symbolsList.remove(word.substring(i - 1, i));
            }
        }
        return true;
    }
}
// END
