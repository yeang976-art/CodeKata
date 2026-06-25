package algolithms.kata;

import java.util.stream.LongStream;

public final class Kata22 {
    public long solution(int a, int b) {
        return LongStream.rangeClosed(Math.min(a,b),Math.max(a,b)).sum();
    }

    static void main() {
        System.out.println(new Kata22().solution(2,8));
    }
}
