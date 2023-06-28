import java.util.*;

class Solution {
    public Object solution(int[] numbers) {
        Map<Integer, Integer> map =new HashMap<>();

        for(int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j< numbers.length; j++) {
                int n = numbers[i] + numbers[j];
                map.put(n, n);
            }
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));

        return keyList;
    }
}