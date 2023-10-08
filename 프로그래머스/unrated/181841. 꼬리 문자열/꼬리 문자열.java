class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for (String s : str_list) {
            if (s.indexOf(ex) == -1) {
                sb.append(s);
            }
        }
        
        if (sb.length() == 0) {
            sb.append("");
        }
        
        return sb.toString();
    }
}