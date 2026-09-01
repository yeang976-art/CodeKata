package algolithms.kata;

//
public final class Kata51 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.repeat(String.valueOf(i), Math.max(0, food[i] / 2));
        }
        return sb + "0" + sb.reverse();
    }
}
