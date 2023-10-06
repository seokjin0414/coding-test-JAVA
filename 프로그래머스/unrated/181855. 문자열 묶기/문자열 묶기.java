import java.util.*;
class Solution {
    public int solution(String[] strArr) {
       Map<Integer, Integer> map =new HashMap<>();

        for (String s : strArr) {
            map.put(s.length(), map.getOrDefault(s.length(), 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((i1, i2) -> map.get(i2).compareTo(map.get(i1)));
        
        return map.get(keySet.get(0));
    }
}