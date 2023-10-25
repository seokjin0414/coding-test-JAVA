import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Integer, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c - 97, map.getOrDefault(c - 97, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (map.getOrDefault(i, 0) == 1) {
                sb.append((char)(i + 97));
            }
        }

        return sb.toString();
    }
}