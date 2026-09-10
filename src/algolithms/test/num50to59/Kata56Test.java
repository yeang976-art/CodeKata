package algolithms.test.num50to59;

import algolithms.kata.num50to59.Kata56;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata56Test {

    private final Kata56 no56 = new Kata56();

    @Test
    @DisplayName("56번")
    void n56() {

        assertEquals(8, no56.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }
}