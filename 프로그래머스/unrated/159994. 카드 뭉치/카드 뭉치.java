import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (String s : cards1) {
            list1.add(s);
        }
        
        for (String s : cards2) {
            list2.add(s);
        }

        for (String s : goal) {
            if (list1.size() > 0 && s.equals(list1.get(0))) {
                list1.remove(s);
            } else if (list2.size() > 0 && s.equals(list2.get(0))) {
                list2.remove(s);
            } else {
                return "No";
            }
        }
        
        return answer;
    }
}