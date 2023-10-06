class Solution {
    public int[] solution(int[] arr, int n) {
        int i = arr.length % 2 == 0 ? 1 : 0;

        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == i) {
                arr[j] = arr[j] + n;
            }
        }
        
        return arr;
    }
}