class Solution {
    public int solution(int n) {
        int answer = 1;

        for (int i=1; i<=n/2; i++) {
            int num = i;
            int sum = i;

            if (sum == n) {
                answer++;
            }

            while (sum <= n) {
                num = num+1;
                sum += num;

                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }

        }
        
        

        return answer;
    }
}