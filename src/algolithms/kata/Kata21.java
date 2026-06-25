package algolithms.kata;

public final class Kata21 {
    public boolean solution(int x) {
        return x % String.valueOf(x).chars().map(ch -> ch - '0').sum() == 0;
    }

    static void main() {
        System.out.println(new Kata21().solution(247));
    }
}
