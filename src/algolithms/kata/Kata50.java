package algolithms.kata;

//
public final class Kata50 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                answer[i] = -1;
                continue;
            }
            for (int n = i - 1; n >= 0; n--) {
                if (s.charAt(n) == s.charAt(i)) {
                    answer[i] = i - n;
                    break;
                }
                answer[i] = -1;
            }
        }
        return answer;
    }
}
