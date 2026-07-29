package algolithms.kata.num30to39;

// 문자열 다루기 기본
public final class Kata36 {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
            return true;
        }
        return false;
    }
}
