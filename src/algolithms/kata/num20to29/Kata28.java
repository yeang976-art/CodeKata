package algolithms.kata.num20to29;

import java.util.Arrays;
import java.util.stream.IntStream;

public final class Kata28 {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(0, 9)
                .filter(a -> Arrays.stream(numbers).noneMatch(b -> a == b))
                .sum();
    }

    static void main() {
        System.out.println(new Kata28().solution(new int[]{1, 3, 5, 7, 9}));
    }
}
