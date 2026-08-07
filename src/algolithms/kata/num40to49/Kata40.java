package algolithms.kata.num40to49;

// 3진법 뒤집기
public final class Kata40 {
    public int solution(int n) {
        return Math.toIntExact(Long.parseLong(String.valueOf(Long.parseLong(
                new StringBuilder()
                        .append(Long.toString(n, 3))
                        .reverse()
                        .toString(),
                3)), 10));
    }
}
