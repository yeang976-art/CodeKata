// [Notice] 47번이랑 48번 서로 교체된 상태임

package algolithms.kata.num40to49;

import java.util.Arrays;

//
public final class Kata48 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        return strings;
    }
}
