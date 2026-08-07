package algolithms.kata.num30to39;

import java.util.stream.IntStream;

public final class Kata32 {
    public int solution(int[] a, int[] b) {
        return IntStream.rangeClosed(0, Math.min(a.length, b.length) - 1)
                .map(i -> a[i] * b[i]).sum();
    }
}
