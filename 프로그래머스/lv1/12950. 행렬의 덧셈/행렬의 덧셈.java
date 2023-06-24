import java.util.ArrayList;
import java.util.List;

class Solution {
    public Object solution(int[][] arr1, int[][] arr2) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for (int i=0; i<arr1.length; i++) {
            List<Integer> list = new ArrayList<>();
            
            for (int j=0; j<arr1[i].length; j++) {
                list.add(arr1[i][j] + arr2[i][j]);
            }
            
            answer.add(list);
        }
        
        return answer;
    }
}