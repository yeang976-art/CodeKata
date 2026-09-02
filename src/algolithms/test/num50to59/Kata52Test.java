package algolithms.test.num50to59;

import algolithms.kata.num50to59.Kata52;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata52Test {

    private final Kata52 no52 = new Kata52();

    @Test
    @DisplayName("52번")
    void n52() {

        assertEquals(9, no52.solution(3, 1, 20));
    }
}