package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata45;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata45Test {

    private final Kata45 no45 = new Kata45();

    @Test
    @DisplayName("45번")
    void n45() {

        assertEquals("a Bc", no45.solution("z Ab", 1));
    }
}