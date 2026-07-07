package algolithms.kata.num20to29;

import java.util.*;
import java.util.stream.*;

public final class Kata27 {
    public String solution(String phone_number) {
        return IntStream.range(0, phone_number.length())
                .mapToObj(i -> i < phone_number.length() - 4 ? "*" : String.valueOf(phone_number.charAt(i)))
                .collect(Collectors.joining());
    }

    static void main() {
        System.out.println(new Kata27().solution("656634654645656"));
    }
}
