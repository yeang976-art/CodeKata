package algolithms.kata.num20to29;

import java.util.stream.IntStream;

public final class Kata26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        try {
            answer = IntStream.rangeClosed(0, absolutes.length - 1)
                    .map(a -> !signs[a] ? absolutes[a] * -1 : absolutes[a]).sum();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        return answer;
    }

    static void main() {
        System.out.println(new Kata26().solution(new int[]{14}, new boolean[]{true, false}));
    }
}
