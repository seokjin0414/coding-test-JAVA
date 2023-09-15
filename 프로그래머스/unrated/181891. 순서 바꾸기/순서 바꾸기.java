import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = n ; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        for (int j = 0; j < n; j++) {
            list.add(num_list[j]);
        }
        
        return list;
    }
}