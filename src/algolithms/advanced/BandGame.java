package algolithms.advanced;

public final class BandGame {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int t = bandage[0], tc = 0; // 연속성공 조건/카운팅
        int x = bandage[1]; // 체력 회복량
        int y = bandage[2]; // 연속성공 보너스
        int currentHealth = health;

        // 공격 시점 저장
        int[] attackMoment = new int[attacks.length];
        for (int i = 0; i < attackMoment.length; i++)
            attackMoment[i] = attacks[i][0];

        // 게임 진행
        for (int sec = 0; sec <= attacks[attacks.length - 1][0]; sec++) {
            for (int a : attackMoment) {
                // 공격당함
                if (sec == a) {
                    currentHealth -= attacks[sec][1];
                    tc = 0;
                    if (currentHealth <= 0) {
                        answer = -1; // 게임오버
                        break;
                    }
                    break;
                }
            }
            // 방어성공
            tc++;
            // 체력 회복
            if (currentHealth < health) {
                currentHealth += x;
                if (tc == t) {
                    currentHealth += y; // 보너스
                    tc = 0;
                }
                if (currentHealth > health) currentHealth = health; // 체력 꽉참
            }
        }

        if (currentHealth > 0) answer = currentHealth;
        return answer;
    }

    static void main() {
        int[] a = {5,1,5};
        int b = 30;
        int[][] c = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(new BandGame().solution(a,b,c));
    }
}
