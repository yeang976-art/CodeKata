package algolithms.kata.num20to29;

import java.util.stream.*;

public final class Kata24 {
    public String solution(String[] seoul) {
        int i = IntStream.range(0, seoul.length)
                .filter(a -> seoul[a].equals("Kim"))
                .findFirst().orElseThrow();
        return "김서방은 " + i + "에 있다";
    }

    static void main() {
        String[] s = {"Park","Hwang","Kim"};
        System.out.println(new Kata24().solution(s));
    }
}
