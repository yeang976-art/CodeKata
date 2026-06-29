package algolithms.kata.num20to29;

import java.util.stream.*;

public final class Kata24 {
    public String solution(String[] seoul) {
        int i = IntStream.range(0, seoul.length)
                .filter(a -> seoul[a].equals("Kim"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("김서방은 없다"));
        return "김서방은 " + i + "에 있다";
    }

    static void main() {
        try{
            String[] s = {"Park","Hwang","Lee"};
            System.out.println(new Kata24().solution(s));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
