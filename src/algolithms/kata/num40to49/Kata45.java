package algolithms.kata.num40to49;

//
public final class Kata45 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') sb.append(" ");
            else {
                int parsing = (s.charAt(i) + n) - 26;
                if (s.charAt(i) > 'Z' && s.charAt(i) + n > 'z') sb.append((char) parsing);
                else if (s.charAt(i) <= 'Z' && s.charAt(i) + n > 'Z') sb.append((char) parsing);
                else sb.append((char) (s.charAt(i) + n));
            }
        }
        return sb.toString();
    }
}
