class Solution {
    public int solution(int n) {
        int max = Math.max(n, 6);
        int min = Math.min(n, 6);

        while (min!=0) {
            int r = max % min;
            max = min;
            min = r;
        }
        
        return n/max;
    }
}