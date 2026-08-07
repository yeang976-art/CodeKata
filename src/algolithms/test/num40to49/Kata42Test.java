package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata42;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata42Test {

    private final Kata42 no42 = new Kata42();

    @Test
    @DisplayName("42번")
    void n42() {

        assertEquals(0, no42.solution(new int[]{1,2,3,4}));
    }
}