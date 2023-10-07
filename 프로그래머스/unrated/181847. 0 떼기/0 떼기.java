class Solution {
    public String solution(String n_str) {
        int n = 0;
        for (char c : n_str.toCharArray()) {
           if (c - 48 == 0) {
               n++;
               continue;
           } else {
               break;
           }
        }
        return n_str.substring(n);
    }
}