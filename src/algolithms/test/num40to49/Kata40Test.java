package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata40;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata40Test {

    private final Kata40 no40 = new Kata40();

    @Test
    @DisplayName("40번")
    void n40() {

        assertEquals(7, no40.solution(45));
    }
}