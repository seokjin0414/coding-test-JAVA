import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        
        StringBuilder sb = new StringBuilder(new String(cArr)).reverse();
        
        return sb.toString();
    }
}