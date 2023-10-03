import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            int n = arr[i];
            if (flag[i]) {
                for (int j = 0; j < n * 2; j++) {
                    list.add(n);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        return list;
    }
}