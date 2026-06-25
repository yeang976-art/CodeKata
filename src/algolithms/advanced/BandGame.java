package algolithms.advanced;

public final class BandGame {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int sec = 0; // 시간 초기화
        int t = bandage[0], tc = 0; // 연속성공 조건/카운팅
        int x = bandage[1]; // 체력 회복량
        int y = bandage[2]; // 연속성공 보너스
        int currentHealth = health; // 체력 세팅

        // 공격 시점 저장
        int[] attackMoment = new int[attacks.length];
        for (int i = 0; i < attackMoment.length; i++)
            attackMoment[i] = attacks[i][0];

        // 게임 진행
        boolean damaged = false;
        // 라운드 안끝났고 플레이어가 살아있는 동안에만
        while (currentHealth > 0 && sec <= attacks[attacks.length - 1][0]) {
            for (int i = 0; i < attackMoment.length; i++) {
                // 공격당함
                if (sec == attackMoment[i]) {
                    damaged = true;
                    tc = 0;
                    currentHealth -= attacks[i][1]; // 데미지 적용
                }
            }
            // 방어성공
            if (!damaged) {
                tc++;
                // 체력 회복 (1초 버티고나서 회복)
                if (tc > 0 && currentHealth < health) {
                    currentHealth += x;
                    if (tc == t) {
                        currentHealth += y; // 보너스
                        tc = 0;
                    }
                    if (currentHealth > health) currentHealth = health; // 체력 꽉참
                }
            }
            damaged = false;
            sec++;
        }

        // 최종 체력
        return currentHealth > 0 ? currentHealth : -1;
    }

    static void main() {
        int[] a = {5, 1, 5};
        int b = 30;
        int[][] c = {{2, 9}, {9, 15}, {10, 5}, {11, 8}};
        System.out.println(new BandGame().solution(a, b, c));
    }
}
