package algolithms.kata.num40to49;

import java.util.ArrayList;
import java.util.List;

// 추출한 수와 비교하기
public final class Kata43 {
    public int solution(String t, String p) {
        List<Long> list = new ArrayList<>(); // Integer로 박싱 계획 시 런타임 오류
        for (int i = 0; i + p.length() <= t.length(); i++) {
            list.add(Long.parseLong(t.substring(i, i + p.length())));
        }
        return list.stream().filter(n -> n <= Long.parseLong(p)).toArray().length;
    }
}
