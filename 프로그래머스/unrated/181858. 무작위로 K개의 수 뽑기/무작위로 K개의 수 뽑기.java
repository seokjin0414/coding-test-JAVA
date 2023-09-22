import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] fArr = Arrays.stream(arr).distinct().toArray();
        for (int i =0; i< k; i++) {
            if (i < fArr.length) {
                answer[i] = fArr[i];
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}