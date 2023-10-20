import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<Character> list = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);

        return sb.toString();
    }
}