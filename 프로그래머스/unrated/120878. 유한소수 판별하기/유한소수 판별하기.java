class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while (min != 0) {
            int n = max % min;
            max = min;
            min = n;
        }

        b /= max;
        
        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }

        return answer;
    }
}