import java.util.Arrays;

class Solution {
    public long solution(long n) {
       char[] cArr = String.valueOf(n).toCharArray();
        Arrays.sort(cArr);

        StringBuilder sb = new StringBuilder();

        for (int i=cArr.length-1; i>=0; i--) {
            sb.append(cArr[i]);
        }


        return Long.parseLong(sb.toString());
    }
}