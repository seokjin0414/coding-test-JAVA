import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list =new ArrayList<>();
        list.add(n);
        while(true) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;    
            }
            list.add(n);
            
            if (n == 1) {
                break;
            }
        }

        return list;
    }
}