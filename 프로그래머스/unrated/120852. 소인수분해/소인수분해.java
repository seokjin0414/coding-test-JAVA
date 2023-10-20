import java.util.*;
import java.util.stream.Collectors;
class Solution {
     public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();

        while (n > 1) {
            if (n % 2 == 0) {
                list.add(2);
                n /= 2;
            } else {
                for (int i = 3; i <= n; i++) {
                    if (i % 2 == 0) {
                        continue;
                    }

                    int cnt = 0;

                    for (int j = 3; j <= Math.sqrt(i); j += 2) {
                        if (i != 3 && i % j == 0) {
                            cnt++;
                            break;
                        }
                    }

                    if (cnt == 0 && n % i == 0) {
                        list.add(i);
                        n /= i;
                        break;
                    }
                }
            }
        }

        return list.stream().distinct().sorted().collect(Collectors.toList());
    }
}