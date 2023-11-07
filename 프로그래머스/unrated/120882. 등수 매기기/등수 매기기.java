import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        
        for (int[] arr : score) {
            list.add(arr[0] + arr[1]);
        }
        
        list.sort(Comparator.reverseOrder());
        int[] answer = new int[score.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}