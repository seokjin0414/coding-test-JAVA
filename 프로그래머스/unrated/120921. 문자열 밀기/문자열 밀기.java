class Solution {
    public int solution(String A, String B) {
        int cnt = 0;

        if (A.equals(B)) {
            return cnt;
        }
        
        while (cnt < B.length()) {
            A = moving(A);
            cnt++;
            if (A.equals(B)) {
                return cnt;
            }
        }
        
        return -1;
    }
    
    static String moving(String input) {
        return input.charAt(input.length() - 1) + input.substring(0, input.length() - 1);
    }
}