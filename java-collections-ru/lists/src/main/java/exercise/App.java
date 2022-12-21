package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        word = word.toLowerCase();
        List<String> wordList = new ArrayList<>();

        for (var i = 1; i < word.length(); i++) {
            wordList.add(word.substring(i - 1, i));
        }

        for (var i = 1; i < symbols.length(); i++) {
            if (wordList.indexOf(symbols.substring(i - 1, i)) == -1) {
                return false;
            }
        }
        return false;
    }
}
// END
