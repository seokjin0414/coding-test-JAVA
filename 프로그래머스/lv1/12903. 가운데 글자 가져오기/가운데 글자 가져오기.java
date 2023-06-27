class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        
        if (l % 2 == 0) {
            sb.append(s.charAt((l/2)-1));
            sb.append(s.charAt(l/2));
        } else {
            sb.append(s.charAt(l/2));
        }
        
        return sb.toString();
    }
}