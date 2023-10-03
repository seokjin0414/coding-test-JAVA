import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.size() != 0 && list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
            } else {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }
        
        return list;
    }
}