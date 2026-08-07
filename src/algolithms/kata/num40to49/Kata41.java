package algolithms.kata.num40to49;

// CoDe KaTa
public final class Kata41 {
    public String solution(String s) {
        char[] c = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                c[i] = cnt % 2 == 0 ? Character.toUpperCase(c[i]) : Character.toLowerCase(c[i]);
                cnt++;
            } else cnt = 0;
        }
        StringBuilder sb = new StringBuilder();
        for(char a : c) sb.append(a);
        return sb.toString();
    }
}
