class Solution {
    public int[][] solution(int[][] arr) {
        if (arr.length == arr[0].length) {
            return arr;
        }

        int r = arr[0].length;
        int c = arr.length;
        int max = Math.max(r, c);
        int[][] answer = new int[max][max];

        for (int i = 0; i < max; i++) {
            for (int j = 0; j< max; j++) {
                if (i >= c || j >= r) {
                    answer[i][j] = 0;
                } else {
                    answer[i][j] = arr[i][j];
                }
            }
        }

        return answer;
    }
}