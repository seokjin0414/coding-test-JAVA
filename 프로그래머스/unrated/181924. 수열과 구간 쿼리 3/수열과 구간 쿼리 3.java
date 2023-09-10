class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] i : queries) {
            int n = arr[i[0]];
            arr[i[0]] = arr[i[1]];
            arr[i[1]] = n;
        }

        return arr;
    }
}