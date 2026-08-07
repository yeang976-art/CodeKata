package algolithms.kata.num20to29;

import java.util.stream.LongStream;

public final class Kata22 {
    public long solution(int a, int b) {
        return LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();

        // 다른풀이
        /* 다른풀이
        long sum = 0;
        for (long i = Math.min(a, b); i <= Math.max(a, b); i++)
            sum += i;
        return sum;
        */
    }

    static void main() {
        System.out.println(new Kata22().solution(2, 8));
    }
}
