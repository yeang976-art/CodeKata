package algolithms.kata.num40to49;

// 숫자 문자열과 영단어
public final class Kata46 {
    public int solution(String s) {

        String[] cards = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < cards.length; i++)
            s = s.replace(cards[i], i + "");

        return Integer.parseInt(s);
    }
}
