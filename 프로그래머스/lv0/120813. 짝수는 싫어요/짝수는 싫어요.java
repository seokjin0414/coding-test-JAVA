import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();

        if (n % 2 == 0) {
            n = n - 1;
        }

        for (int i = 1; i <= n; i+=2) {
            list.add(i);
        }
        
        return list;
    }
}