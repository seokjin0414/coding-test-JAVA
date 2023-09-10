class Solution {
        public int[] solution(int[] num_list) {
           int n = num_list.length;
            int[] answer = new int[n + 1];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];

            if (i == n - 1) {
                if (num_list[i] > num_list[i - 1]) {
                    answer[n] = num_list[i] - num_list[i - 1];
                } else {
                    answer[n] = num_list[i] * 2;
                }
            }
        }
        
        return answer;
        }
}