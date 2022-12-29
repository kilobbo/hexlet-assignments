package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] arrayImage) {
        String[][] doubledRows = new String[arrayImage.length * 2][arrayImage.length * 2];

        String[][] res = Arrays.stream(arrayImage)
                .flatMap(row -> Stream.of(row, row))
                .toArray(String[][]::new);

        return res;
    }
}
// END
