import java.util.*;

class Solution {
    public Object solution(int n, int[] arr1, int[] arr2) {
        List<String> list =new ArrayList<>();

        for (int i=0; i<arr1.length; i++) {
            StringBuilder sb = new StringBuilder();

            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);

            if (a.length() != n) {
                a ="0".repeat(n-a.length()) + a;
            }

            if (b.length() != n) {
                b ="0".repeat(n-b.length()) + b;
            }

            for (int j=0; j<a.length(); j++) {
                sb.append(Math.max(a.charAt(j) -48, b.charAt(j) - 48) > 0 ? "#" : " ");
            }

            list.add(sb.toString());
        }

        return list;
    }
}