package algolithms.kata.num20to29;

import java.util.Arrays;

public final class Kata29 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = Arrays.stream(arr).min().orElseThrow();
        return Arrays.stream(arr)
                .filter(a -> a != min)
                .toArray();
    }

    static void main() {
        System.out.println(Arrays.toString(new Kata29().solution(new int[]{2, 3, 5, 7, 9})));
    }
}
