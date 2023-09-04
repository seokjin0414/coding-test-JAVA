
import java.io.*;
import java.util.*;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((i1, i2) -> map.get(i2).compareTo(map.get(i1)));

        if (keySet.size() > 1 && map.get(keySet.get(0)) == map.get(keySet.get(1))) {
            return -1;
        }

        return keySet.get(0);
    }
}