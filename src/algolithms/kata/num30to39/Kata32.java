package algolithms.kata.num30to39;

import java.util.stream.IntStream;

public final class Kata32 {
    public int solution(int[] a, int[] b) {
        return IntStream.rangeClosed(0, Math.min(a.length, b.length) - 1)
                .map(i -> a[i] * b[i]).sum();
    }

    static void main() {
        System.out.println(new Kata32().solution(new int[]{4, -4, 6, -2}, new int[]{-8, 4, 6, -3}));
    }
}
