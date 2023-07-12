import java.util.*;

public class Solution {
    static int ans;
    
    public static void cal(int i) {
        ans += (i % 2);
        if (i / 2 > 1) {
            cal(i / 2);
        }
    }
    
    public int solution(int n) {
        ans = n == 1 ? 0 : 1;
        cal(n);
        return ans;
    }
}