package algolithms.kata.num50to59;

import java.util.Arrays;

//
public final class Kata56 {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        int remainder = score.length % m;

        for (int i = remainder; i < score.length; i += m) {
            answer += score[i] * m;
        }

        return answer;
    } // ㄱ--
}
