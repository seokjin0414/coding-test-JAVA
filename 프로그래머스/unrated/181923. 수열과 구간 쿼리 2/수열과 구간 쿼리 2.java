class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int min = -1;
            int line = queries[i][2];
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > line) {
                    min = min == -1 ? arr[j] : Math.min(min, arr[j]);
                }
            }
            answer[i] = min;
        }
        return answer;
    }
}