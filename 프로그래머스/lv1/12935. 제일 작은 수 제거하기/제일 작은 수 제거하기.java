import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        if (arr.length == 1) {
            list.add(-1);
        } else {
            for (int i : arr) {
                list.add(i);
            }

            Arrays.sort(arr);
            int min = arr[0];
            
            list.remove(Integer.valueOf(min));
        }
        
        return list;
    }
}