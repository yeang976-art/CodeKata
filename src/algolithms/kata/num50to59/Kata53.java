package algolithms.kata.num50to59;

import java.util.ArrayList;
import java.util.List;

//
public final class Kata53 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();
        for (int d = 0; d < score.length; d++) {
            if (d < k)
                rank.add(score[d]);
            else {
                rank.remove(rank.stream().min(Integer::compareTo).orElseThrow());
                rank.add(Math.max(score[d], answer[d - 1]));
            }
            answer[d] = rank.stream().min(Integer::compareTo).orElseThrow();
        }
        return answer;
    }
}
