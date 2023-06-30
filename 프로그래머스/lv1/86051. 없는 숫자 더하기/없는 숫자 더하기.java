import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Map<Integer, Integer> map =new HashMap<>();
        int n = 0;
        
        for (int i : numbers) {
            map.put(i,1);
        }
        
        for (int j=0; j<10; j++) {
            if (!map.containsKey(j)) {
                n+=j;
            }
        }
        
        return n;
    }
}