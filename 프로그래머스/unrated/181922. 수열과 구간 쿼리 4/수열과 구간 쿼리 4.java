class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] i : queries) {
            int line = i[2];

            for (int j = i[0]; j <= i[1]; j++) {
                if (j % line == 0) {
                    arr[j] = arr[j] + 1;
                }
            }
        }
        return arr;
    }
}