class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        StringBuilder sb = new StringBuilder();

        int n = 0;

        for (String a : sArr) {
            n = a.equals(" ") ? 0 : n+1;

            if (n % 2 == 0) {
                sb.append(a.toLowerCase());
            } else {
                sb.append(a.toUpperCase());
            }
        }

        return sb.toString();
    }
}