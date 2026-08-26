package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata47;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Kata47Test {

    private final Kata47 no47 = new Kata47();

    @Test
    @DisplayName("47번")
    void n47() {
        assertArrayEquals(new int[]{5, 6, 3},
                no47.solution(
                        new int[]{1, 5, 2, 6, 3, 7, 4},
                        new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }
}