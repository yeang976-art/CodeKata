package algolithms.kata.num40to49;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//
public final class Kata49 {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }
        return answer.stream().sorted(Comparator.naturalOrder()).toList();
    }
}
