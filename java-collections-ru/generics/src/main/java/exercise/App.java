package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {

        List<Map<String, String>> selectedBooks = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean check = false;
            for (Map.Entry<String, String> criteria : where.entrySet()) {
                if (book.containsKey(criteria.getKey())) {
                    if (book.containsValue(criteria.getValue())) {
                        check = true;
                    } else {
                        break;
                    }
                }
            if (check) {
                selectedBooks.add(book);
            }
            }
        }
        return selectedBooks;
    }
}
//END
