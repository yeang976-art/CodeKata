package algolithms.kata.num50to59;

//
public final class Kata52 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            answer += n / a * b;
            n = (n / a) * b + n % a;
        }
        return answer;
    }
}
