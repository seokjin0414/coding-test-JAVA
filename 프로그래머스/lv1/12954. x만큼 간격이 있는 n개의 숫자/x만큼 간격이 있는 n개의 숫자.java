class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long l = x;

        for (int i=0; i<n; i++) {
            answer[i] = l*(i+1);
        }

        return answer;
    }
}