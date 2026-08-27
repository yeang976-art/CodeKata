package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata48;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Kata48Test {

    private final Kata48 no48 = new Kata48();

    @Test
    @DisplayName("48번")
    void n48() {
        assertArrayEquals(new String[]{"abcd", "abce", "cdx"},
                no48.solution(new String[]{"abce", "abcd", "cdx"}, 2));
    }
}