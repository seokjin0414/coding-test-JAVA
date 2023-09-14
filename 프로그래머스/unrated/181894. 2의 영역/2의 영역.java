import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.remove(0);
                list.add(arr[i]);
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] == 2) {
                        for (int k = i + 1; k <= j; k++) {
                            list.add(arr[k]);
                        }
                        break;
                    } 
                }
                break;
            }
        }
        
        return list;
    }
}