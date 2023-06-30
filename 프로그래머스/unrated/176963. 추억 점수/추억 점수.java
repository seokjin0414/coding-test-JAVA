import java.util.*;

class Solution {
    public Object solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (String[] aArr : photo) {
            int n = 0;
            
            for (String s : aArr) {
                if (map.containsKey(s)) {
                    n += map.get(s);
                }
            }
            
            answer.add(n);
        }

        return answer;
    }
}