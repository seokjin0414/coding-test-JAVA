import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        Collections.reverse(keySet);

        for (int j = 0; j < keySet.size(); j++) {
            emergency[map.get(keySet.get(j))] = j + 1;
        }

        return emergency;
    }
}