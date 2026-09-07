package algolithms.test.num50to59;

import algolithms.kata.num50to59.Kata54;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata54Test {

    private final Kata54 no54 = new Kata54();

    @Test
    @DisplayName("54번")
    void n54() {
        assertEquals("WED", no54.solution(5, 25));
    }
}