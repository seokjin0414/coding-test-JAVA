class Solution {
    public int[][] solution(int n) {
        int v = 1;
        int rowS = 0;
        int rowE = n - 1;
        int colS = 0;
        int colE = n - 1;
        int[][] answer = new int[n][n];
        
        while (v <= n * n) {
            for (int i = colS; i <= colE; i++) {
                answer[rowS][i] = v++;
            }
            rowS++;

            for (int i = rowS; i <= rowE; i++) {
                answer[i][colE] = v++;
            }
            colE--;

            for (int i = colE; i >= colS; i--) {
                answer[rowE][i] = v++;
            }
            rowE--;

            for (int i = rowE; i >= rowS; i--) {
                answer[i][colS] = v++;
            }
            colS++;
        }

        return answer;
    }
}