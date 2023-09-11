import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length;) {
            int size = stk.size();
            if (size == 0) {
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.get(size - 1) >= arr[i]) {
                    stk.remove(size - 1);
                } else {
                    stk.add(arr[i]);
                    i++;
                }
            }
        }

        return stk;
    }
}