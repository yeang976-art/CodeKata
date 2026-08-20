package algolithms.kata.num40to49;

import java.util.Arrays;

//
public final class Kata44 {
    public int solution(int[][] sizes) {
        int answer = 0;
//        int[] l1 = new int[sizes.length];
//        int[] l2 = new int[sizes.length];
//        for (int i = 0; i < sizes.length; i++) {
//            l1[i] = (sizes[i][0]);
//            l2[i] = (sizes[i][1]);
//        }

        int[] l1 = new int[sizes.length];
        int[] l2 = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            l1[i] = Math.max(sizes[i][0], sizes[i][1]);
            l2[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        int m1 = Arrays.stream(l1).max().orElseThrow();
        int m2 = Arrays.stream(l2).max().orElseThrow();

        return m1 * m2;
    }
}
