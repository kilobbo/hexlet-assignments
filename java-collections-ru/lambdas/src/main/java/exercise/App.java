package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] arrayImage) {
        String[][] doubledRows = new String[arrayImage.length * 2][arrayImage.length * 2];

        String[][] res = Arrays.stream(doubledRows)
                .flatMap(row -> Stream.of(row, row))
                .toArray(String[][]::new);

        return res;
    }
}
// END
