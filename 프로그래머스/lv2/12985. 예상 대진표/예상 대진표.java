class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;

        a -= 1;
        b -= 1;

        while (Math.abs(a-b) > 0) {
            a /= 2;
            b /= 2;
            answer++;
        }

        return answer;
    }
}