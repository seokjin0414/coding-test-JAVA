import java.util.*;

class Solution {
   public int solution(int k, int m, int[] score) {
        Integer[] sArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(sArr, Collections.reverseOrder());
        int n = 0;
        
        if (score.length < m) {
            return 0;
        }
        
        for (int i=m; i<=score.length; i+=m) {
            n += (sArr[i-1] * m);
        }

        return n;
    }
}