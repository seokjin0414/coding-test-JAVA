import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;

        for (int i=0; i<reserve.length; i++) {
            for (int j=0; j<lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -1;
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i=0; i< lost.length; i++) {
            if (lost[i] == -1) {
                continue;
            }

            for (int j=0; j<reserve.length; j++) {
                if (Math.abs(lost[i] - reserve[j]) == 1) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}