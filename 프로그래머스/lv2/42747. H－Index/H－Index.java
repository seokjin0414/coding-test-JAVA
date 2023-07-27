import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int n = Math.min(citations[i], citations.length - i);
            
            if (n >= answer) {
                answer = Math.max(answer, n);
            } else {
                break;
            }
        }

        return answer;
    }
}