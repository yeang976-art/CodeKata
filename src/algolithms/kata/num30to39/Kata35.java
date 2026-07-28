package algolithms.kata.num30to39;

import java.util.stream.IntStream;

// 부족한 금액 계산
public final class Kata35 {
    public long solution(int price, int money, int count) {
//        long sum = 0;
//        for (int i = 1; i <= count; i++) sum += (long) price * i;
//        return money - sum < 0 ? -(money - sum) : 0;

        long result = money - IntStream.rangeClosed(1, count).mapToLong(i -> (long) price * i).sum();
        return result < 0 ? -(result) : 0;
    }
}
