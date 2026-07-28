package algolithms.kata.num30to39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata34Test {

    Kata34 no34;
    Kata35 no35;

    @BeforeEach
    void setUp() {
        no34 = new Kata34();
        no35 = new Kata35();
    }

    @Test
    @DisplayName("34번")
    void solution() {
        String answer = "asdfASDF";
        assertEquals("sfdaSFDA", no34.solution(answer));

        String answer2 = "Zbcdefg";
        assertEquals("gfedcbZ", no34.solution(answer2));
    }

    @Test
    @DisplayName("35번")
    void n35() {
        assertEquals(50,no35.solution(50, 100, 2));
    }

    @Test
    void customTest001() {
        char c = 'C';

        assertEquals(1, c - 'B');
    }
}