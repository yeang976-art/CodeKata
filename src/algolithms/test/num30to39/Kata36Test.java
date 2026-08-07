package algolithms.test.num30to39;

import algolithms.kata.num30to39.Kata36;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class Kata36Test {

    private final Kata36 no36 = new Kata36();

    @Test
    @DisplayName("36번")
    void n36() {
        String s = "fgfdk4";

        assertFalse(no36.solution(s));
    }
}