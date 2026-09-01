package algolithms.test.num50to59;

import algolithms.kata.Kata50;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Kata50Test {

    private final Kata50 no50 = new Kata50();

    @Test
    @DisplayName("50번")
    void n50() {

        assertArrayEquals(new int[]{-1, -1, 1, -1, -1, -1}, no50.solution("foobar"));
    }
}