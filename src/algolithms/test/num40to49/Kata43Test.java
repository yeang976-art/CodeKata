package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata43;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata43Test {

    private final Kata43 no43 = new Kata43();

    @Test
    @DisplayName("42번")
    void n42() {

        assertEquals(7, no43.solution("5728356537293748", "93"));
    }
}