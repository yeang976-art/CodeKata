package algolithms.test.num30to39;

import algolithms.kata.num30to39.Kata35;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata35Test {

    private final Kata35 no35 = new Kata35();

    @Test
    @DisplayName("35번")
    void n35() {
        assertEquals(50,no35.solution(50, 100, 2));
    }
}