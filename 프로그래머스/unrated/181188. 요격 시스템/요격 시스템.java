import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, (o1, o2) -> { return o1[1]-o2[1]; });

        int l = -1;
        for (int[] target : targets) {
            if (l == -1) {
                l = target[1] - 1;
                answer++;
                continue;
            }

            if (l >= target[0] && l <= target[1]) {
                continue;
            }

            l = target[1] - 1;
            answer++;
        }

        return answer;
    }
}