package algolithms.kata.num20to29;

import java.util.*;

public final class Kata20 {
    public long solution(long n) {
        String s = "" + n;
        List<Integer> c = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
            c.add(Integer.parseInt(s.substring(i, i + 1)));

        c.sort(Collections.reverseOrder());

        for (int a : c)
            sb.append(a);

        return Long.parseLong(sb.toString());
    }

    static void main() {
        System.out.println(new Kata20().solution(24433356));
    }
}
