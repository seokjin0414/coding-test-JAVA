import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            int n = i;
            Boolean c = true;
            while (n > 0) {
                if (n % 10 == 5 || n % 10 == 0) {
                    n /= 10;
                } else {
                    c = false;
                    break;
                }
            }
            if (c) {
                list.add(i);
            }
        }
        
        if (list.size() == 0) {
                list.add(-1);
        }

        return list;
    }
}