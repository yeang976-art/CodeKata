package algolithms.kata.num30to39;

public final class Kata31 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i % 2 == 0 ? "박" : "수");
        }
        return sb.toString();
    }

    static void main() {
        System.out.println(new Kata31().solution(12));
    }
}
