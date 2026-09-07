package algolithms.kata.num50to59;

import java.util.Arrays;

// 2016년
public final class Kata54 {
    public String solution(int a, int b) {
        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int pasted = Arrays.stream(days, 0, a - 1).sum() + b - 1;
        return dayOfWeek[pasted % dayOfWeek.length];
    }
}
