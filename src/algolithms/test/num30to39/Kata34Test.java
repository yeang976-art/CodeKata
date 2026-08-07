package algolithms.test.num30to39;

import algolithms.kata.num30to39.Kata34;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata34Test {

    private final Kata34 no34 = new Kata34();

    @Test
    @DisplayName("34번")
    void solution() {
        String answer = "asDF";
        assertEquals("FDsa", no34.solution(answer));

        String answer2 = "Zbcdefg";
        assertEquals("gfedcbZ", no34.solution(answer2));
    }

    @Test
    void customTest001() {
        char c = '0';

        assertEquals(48, c);
    }
}