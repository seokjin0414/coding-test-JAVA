class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n/a > 0) {
            int input = (n/a)*b;
            n = input + (n%a);
            answer += input;
        }
        
        return answer;
    }
}