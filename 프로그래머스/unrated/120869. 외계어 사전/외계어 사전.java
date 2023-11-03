class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (String s : dic) {
            int n = 0;
            for (String sp : spell) {
                if (s.contains(sp)) {
                    continue;
                } else {
                    n = -1;
                    break;
                }
            }
            if (n == 0) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}