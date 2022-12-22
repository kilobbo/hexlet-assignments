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
            if (!wordsAndCount.containsKey(word)) {
                wordsAndCount.put(word, count);
            } else {
                wordsAndCount.put(word, wordsAndCount.get(word) + 1);
            }
        }
        return wordsAndCount;
    }

    public static String toString(Map<String, Integer> dictionary) {
        StringBuilder mapToString = new StringBuilder("{\n");

        for (Map.Entry<String, Integer> word: dictionary.entrySet()) {
            mapToString.append("  ").append(word.getKey()).append(": ").append(word.getValue()).append("\n");
        }
        mapToString.append("}");
        return mapToString.toString();
    }
}
//END
