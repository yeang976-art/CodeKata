package algolithms.test.num30to39;

import algolithms.kata.num30to39.Kata32;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata32Test {

    private final Kata32 no32 = new Kata32();

    @Test
    @DisplayName("32번")
    void n32() {
        assertEquals(-6,no32.solution(new int[]{4, -4, 6, -2}, new int[]{-8, 4, 6, -3}));
    }
}