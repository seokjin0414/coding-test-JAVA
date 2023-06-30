import java.util.*;

class Solution {
    public Object solution(String[] keymap, String[] targets) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>(); 
        
        for (String s : keymap) {
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                
                if (map.containsKey(c)) {
                    if (map.get(c) > i+1) {
                        map.put(c,i+1);
                    }
                } else {
                    map.put(c,i+1);
                }
            }
        }
        
        for (String s : targets) {
            int n = 0;
            
            for (int j=0; j<s.length(); j++) {
                char c = s.charAt(j);

                if (map.containsKey(c)) {
                    n += map.get(c);
                } else {
                    n = -1;
                    break;
                }
            }
            
            list.add(n);
        }
        return list;
    }
}