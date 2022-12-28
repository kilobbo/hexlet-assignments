package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        long count = emails.stream()
                .filter(name -> name.endsWith("@gmail.com") || name.endsWith("@yandex.ru") || name.endsWith("@hotmail.com"))
                .count();
        return count;
    }
}
// END
