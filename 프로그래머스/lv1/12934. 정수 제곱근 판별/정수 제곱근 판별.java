class Solution {
    public long solution(long n) {
        long answer = 0;

        double d = Math.sqrt(n);

        if (d % 1 == 0.0) {
            answer = (long) Math.pow(d+1,2);
        } else {
            answer = -1;
        }

        return answer;
    }
}