package algolithms.kata.num30to39;

// 최대공약수와 최소공배수
public final class Kata39 {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        // 유클리드 호제법
        while (a != b) {
            int temp = b;
            b = Math.abs(a - b);
            a = temp;
        }
        int gcd = a;

        int l = (m / gcd) * (n / gcd) * gcd;

        return new int[]{gcd, l};
    }
}
