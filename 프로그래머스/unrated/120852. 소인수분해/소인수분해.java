import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i ==0) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;               
                }
            }
        }

        list.sort(Comparator.naturalOrder());
        
        return list;
    }
}