class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;

            while (check(answer) == -1) {
                answer++;
            }
        }

        return answer;
    }

    static int check(int input) {
        if (input % 3 == 0 ) {
            return -1;
        }

        while (input != 0) {
            if (input % 10 == 3) {
                return -1;
            }
            input /= 10;
        }
        return 1;
    }
}