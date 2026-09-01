package algolithms.test.num50to59;

import algolithms.kata.Kata51;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata51Test {

    private final Kata51 no51 = new Kata51();

    @Test
    @DisplayName("51번")
    void n45() {

        assertEquals("111303111", no51.solution(new int[]{1, 7, 1, 2}));
    }
}