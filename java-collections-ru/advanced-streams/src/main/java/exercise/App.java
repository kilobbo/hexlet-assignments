package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String content) {
                return Arrays.stream (content.split("\n"))
                .filter(str -> str.startsWith("environment"))
                .map(x -> x.replace("environment=", ""))
                .map(x -> x.replaceAll("\"", ""))
                .flatMap(x -> Stream.of(x.split(",")))
                .filter(str1 -> str1.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END