package algolithms.test.num50to59;

import algolithms.kata.num50to59.Kata53;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Kata53Test {

    private final Kata53 no53 = new Kata53();

    @Test
    @DisplayName("53번")
    void n53() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300},
                no53.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }
}