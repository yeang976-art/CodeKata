package algolithms.kata.num20to29;

import java.util.*;

public final class Kata25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .filter(a -> a % divisor == 0)
                .sorted().toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }

    static void main() {
        int[] arr = {4, 9, 7, 13};
        System.out.println(Arrays.toString(new Kata25().solution(arr, 5)));
    }
}
