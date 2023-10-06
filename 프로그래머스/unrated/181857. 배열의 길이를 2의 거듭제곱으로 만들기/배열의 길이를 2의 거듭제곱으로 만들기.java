class Solution {
    public int[] solution(int[] arr) {
        int l = 0;
        int arrL = arr.length;
        int i = 0;

        while (true) {
            if (arrL <= Math.pow(2, i)) {
                l = (int) Math.pow(2, i);
                break;
            }
            i++;
        }

        int[] answer = new int[l];

        for (int j = 0; j < l; j++) {
            if (j < arrL) {
                answer[j] = arr[j];
            } else {
                answer[j] = 0;
            }
        }

        return answer;
    }
}