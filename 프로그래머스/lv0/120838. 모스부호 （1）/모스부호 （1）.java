import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-.." , ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] arr = letter.split(" ");
        Map<String, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char) (i + 97));
        }

        for (String s : arr) {
            sb.append(map.get(s));
        }
        return sb.toString();
    }
}