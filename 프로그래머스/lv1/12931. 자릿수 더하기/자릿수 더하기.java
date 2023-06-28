import java.util.*;

public class Solution {
    public int solution(int n) {
        StringBuilder sb =new StringBuilder(String.valueOf(n));
        int answer = 0;

        for (int i=0; i<sb.length(); i++) {
            answer += sb.charAt(i) - 48;
        }

        return answer;
    }
}