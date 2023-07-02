class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        
        for (char c=97; c<=122; c++) {
            if (skip.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        
        for (int i=0; i<s.length(); i++) {
            ss.append(sb.charAt((sb.indexOf(String.valueOf(s.charAt(i))) + index) % sb.length()));
        }

        return ss.toString();
    }
}