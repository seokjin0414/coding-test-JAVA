class Solution {
    public int solution(int a, int b) {
        String x = String.valueOf(a);
        String y = String.valueOf(b);
        
        return Math.max(Integer.parseInt(x + y), Integer.parseInt(y + x));
    }
}