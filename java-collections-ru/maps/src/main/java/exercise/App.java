package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsAndCount = new HashMap<>();
        int count = 1;

        String[] words = sentence.split(" ");

        for (String word : words) {
            if (words.length == 1) {
                return wordsAndCount;
            } else if (!wordsAndCount.containsKey(word)) {
                wordsAndCount.put(word, count);
            } else {
                wordsAndCount.put(word, wordsAndCount.get(word) + 1);
            }
        }
        return wordsAndCount;
    }

    public static String toString(Map<String, Integer> dictionary) {
        StringBuilder mapToString = new StringBuilder("{");

        for (Map.Entry<String, Integer> word: dictionary.entrySet()) {
            if (!dictionary.containsValue(1)) {
                mapToString.append("}");
                return mapToString.toString();
            } else {
                mapToString.append("\n  ").append(word.getKey()).append(": ").append(word.getValue());
            }
        }
        mapToString.append("\n}");
        return mapToString.toString();
    }
}
//END
