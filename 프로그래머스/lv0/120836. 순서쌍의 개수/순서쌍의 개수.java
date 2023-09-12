class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.ceil(Math.sqrt(n)); 
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0) {
                answer+=2;
            }
        }
        
        if (sqrt * sqrt == n) {
            answer++;
        }

        return answer;
    }
}