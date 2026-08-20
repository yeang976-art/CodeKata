package algolithms.test.num40to49;

import algolithms.kata.num40to49.Kata44;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata44Test {

    private final Kata44 no44 = new Kata44();

    @Test
    @DisplayName("44번")
    void n44() {
        int[][] sizes = new int[2][];
        sizes[0] = new int[]{23, 44};
        sizes[1] = new int[]{56, 15};

        assertEquals(23, no44.solution(sizes));
    }
}