package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata41;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata41Test {

    private final Kata41 no41 = new Kata41();

    @Test
    @DisplayName("41번")
    void n41() {

        assertEquals("AbCd EfG", no41.solution("abcd efg"));
    }
}