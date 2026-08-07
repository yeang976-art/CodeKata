package algolithms.kata.num30to39;

import java.util.Scanner;
import java.util.stream.IntStream;

// 직사각형 별 찍기
public final class Kata38 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) System.out.print('*');
            System.out.println();
        }
    }
}
