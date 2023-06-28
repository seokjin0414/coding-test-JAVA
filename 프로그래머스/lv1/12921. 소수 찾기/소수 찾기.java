class Solution {
    public int solution(int n) {
        int answer = 1;

        for (int i=3; i<=n; i++) {
            if (i % 2 == 0) {
                continue;
            }

            int cnt = 0;

            for (int j=3; j<=Math.sqrt(i); j+=2) {
                if (i != 3 && i % j == 0) {
                    cnt ++;
                    break;
                }
            }

            if (cnt == 0) {
                answer++;
            }
        }

        return answer;
    }
}