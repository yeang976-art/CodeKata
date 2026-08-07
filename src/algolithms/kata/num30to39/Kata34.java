package algolithms.kata.num30to39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 문자열 내림차순 배치
public final class Kata34 {
    public String solution(String s) {
        // Naive
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) list.add(s.charAt(i));
        list.sort(Comparator.reverseOrder());
        for (Character a : list) sb.append(a);
        return sb.toString();

        // Stream
//        return s.chars().s(Comparator.reverseOrder()).collect(
//                StringBuilder::new,
//                (sb, c) -> sb.append((char) c),
//                StringBuilder::append).reverse().toString();
    }
}
