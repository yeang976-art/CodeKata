package algolithms.test.num30to39;

import algolithms.kata.num30to39.Kata39;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Kata39Test {

    private final Kata39 no39 = new Kata39();

    @Test
    @DisplayName("39번")
    void n39() {
        int[] a = new int[]{3, 12};

        assertEquals(a, no39.solution(3, 12));
    }
}