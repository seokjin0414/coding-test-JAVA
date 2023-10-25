import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }

        list.sort(Comparator.naturalOrder());
        return list;
    }
}