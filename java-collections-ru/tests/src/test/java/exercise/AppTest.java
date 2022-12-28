package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List <Integer> elements1 = List.of(1, 2, 3, 4);
        int count1 = 2;
        List <Integer> expected1 = List.of(1, 2);
        List <Integer> actual1 = App.take(elements1, count1);
        assertThat(actual1).isEqualTo(expected1);

        List <Integer> elements2 = List.of(7, 3, 10);
        int count2 = 9;
        List <Integer> expected2 = List.of(7, 3, 10);
        List <Integer> actual2 = App.take(elements2, count2);
        assertThat(actual2).isEqualTo(expected2);
        // END
    }
}
