import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String beforeString = Arrays.toString(beforeArr);
        String afterString = Arrays.toString(afterArr);
        
        if (beforeString.equals(afterString)) {
            return 1;
        } else {
            return 0;
        }
    }
}