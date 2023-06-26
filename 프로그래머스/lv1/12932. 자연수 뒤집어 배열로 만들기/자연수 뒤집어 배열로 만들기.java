import java.util.ArrayList;
import java.util.List;

class Solution {
    public Object solution(long n) {
        List<Integer> answer = new ArrayList<>();

        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();

        for (int i=0; i<sb.length(); i++) {
            answer.add(sb.charAt(i) - 48);   
        }
        
        return answer;
    }
}