import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            if (58 > c) {
                list.add(c - 48);
            }
        }

        Collections.sort(list);

        return list;
    }
}