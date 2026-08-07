package algolithms.test.num30to39;

import algolithms.kata.num30to39.Kata33;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata33Test {

    private final Kata33 no33 = new Kata33();

    @Test
    @DisplayName("33번")
    void n33() {
        assertEquals(50,no33.solution(13, 17));
    }
}