package algolithms.kata.num30to39;

import java.util.stream.IntStream;

public final class Kata33 {
    public int solution(int left, int right) {
        // Naive
        /*
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            answer = cnt % 2 == 0 ? answer + i : answer - i;
        }
        return answer;
        */

        // Mathematical
        /*
        int answer = 0;
        for (int i = left; i <= right; i++) {
            answer = Math.sqrt(i) % 1 == 0 ? answer - i : answer + i;
        }
        return answer;
        */

        // Mathematical Stream
        return IntStream.rangeClosed(left, right).map(i -> Math.sqrt(i) % 1 == 0 ? i * -1 : i).sum();
    }

    static void main() {
        System.out.println(new Kata33().solution(13, 17));
    }
}
