import java.util.ArrayList;
import java.util.List;
class Solution {
     public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b;
        int c = 1;
        
        if (n == 1) {
            b = slicer[1];
        } else if (n == 2) {
            a = slicer[0];
            b = num_list.length - 1;
        } else if (n == 3) {
            a = slicer[0];
            b = slicer[1];
        } else {
            a = slicer[0];
            b = slicer[1];
            c = slicer[2];
        }
        
        for (int i = a; i <= b; i += c) {
            list.add(num_list[i]);
        }
        
        return list;
    }
}