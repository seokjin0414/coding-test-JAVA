class Solution {
    public int solution(int[] num_list) {
        int m = 1;
        int s = 0;
        
        for (int i : num_list) {
            m *= i;
            s += i;
        }
        
        if (m > s * s) {
            return 0;
        } else {
            return 1;
        }
      
    }
}