import java.util.ArrayList;
import java.util.List;

class Solution {
    public Object solution(String[] intStrs, int k, int s, int l) {
            List<Integer> answer = new ArrayList<>();
            
            for (String x : intStrs) {
                int y = Integer.parseInt(x.substring(s,s+l));
                if (y > k) {
                    answer.add(y);
                }
            }

            return answer;
        }
}