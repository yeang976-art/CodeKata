package algolithms.kata.num20to29;

public final class Kata23 {
    public int solution(int num) {
        int cnt = 0;
        while (num > 1 && cnt <= 500) {
            cnt++;
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        }
        return num == 1 ? cnt : -1;
    }

    static void main() {
        System.out.println(new Kata23().solution(6));
    }
}
