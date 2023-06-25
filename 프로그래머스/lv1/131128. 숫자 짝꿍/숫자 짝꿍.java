import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (String s : X.split("")) {
            xArr[Integer.parseInt(s)]++;
        }
        for (String s : Y.split("")) {
            yArr[Integer.parseInt(s)]++;
        }

        for (int i=xArr.length-1; i>=0; i--) {
            while (xArr[i]>0 && yArr[i]>0) {
                xArr[i]--;
                yArr[i]--;
                sb.append(i);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        } else if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}