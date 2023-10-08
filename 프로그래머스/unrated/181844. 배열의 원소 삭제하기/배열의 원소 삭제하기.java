import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        List<Integer> delete = new ArrayList<>();
        for (int i : delete_list) {
            delete.add(i);
        }
        
        for (int i : arr) {
            if (delete.indexOf(i) == -1) {
                list.add(i);
            }
        }
        
        return list;
    }
}