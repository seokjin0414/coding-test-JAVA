class Solution {
    private int fn (int input) {
        int cnt = 0;
        while (input > 1) {
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input = (input - 1) / 2;
            }
            cnt++;
        }
        return cnt;
    }

    public int solution(int[] num_list) {
        int answer = 0;
        for (int i : num_list) {
            answer += fn(i);
        }
        return answer;
    }
}