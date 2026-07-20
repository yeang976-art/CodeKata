package algolithms.kata.num30to39;

public final class Kata30 {
    public String solution(String s) {
        return s.substring(s.length() % 2 == 0 ? s.length() / 2 - 1 : s.length() / 2, s.length() / 2 + 1);
    }

    static void main() {
        System.out.println(new Kata30().solution("abcdefgh"));
    }
}
