class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            int n = c - 48;
            if (n == 2) {
                n = 0;
            } else if (n == 0) {
                n = 5;
            } else {
                n = 2;
            }
            sb.append(n);
        }

        return sb.toString();
    }
}