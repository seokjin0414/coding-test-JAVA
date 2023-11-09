class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s : babbling) {
            if (check(s) == 0) {
                answer++;
            }
        }

        return answer;
    }

    int check(String s) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int n = s.length();
        
        for (String w : arr) {
            if (s.startsWith(w)) {
                s = s.substring(w.length());
                n = check(s);
            }
        }
        
        return n;
    }
}