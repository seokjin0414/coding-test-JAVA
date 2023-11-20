class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int n = i; n <= j; n++) {
            answer += count(n, k);
        }
        
        return answer;
    }
    
    static int count(int input, int k) {
        int cnt = 0;
        
        while (input != 0) {
            if (input % 10 == k) {
                cnt++;
            }
            input /= 10;
        }
        
        return cnt;
    }
}