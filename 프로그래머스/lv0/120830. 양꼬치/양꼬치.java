class Solution {
    public int solution(int n, int k) {
        int answer = 12000 * n;
        answer += Math.max(0, k - (n / 10)) * 2000;

        return answer;
    }
}