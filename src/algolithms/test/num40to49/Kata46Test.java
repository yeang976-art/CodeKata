package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata46;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata46Test {

    private final Kata46 no46 = new Kata46();

    @Test
    @DisplayName("46번")
    void n46() {

        assertEquals(234567627, no46.solution("2three45sixsevensix2seven"));
    }
}