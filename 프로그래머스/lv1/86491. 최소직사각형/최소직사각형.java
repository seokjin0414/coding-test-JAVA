class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;

        for (int[] arr : sizes) {
            x = Math.max(x, Math.max(arr[0], arr[1]));
            y = Math.max(y, Math.min(arr[0], arr[1]));
        }

        return x * y;
    }
}