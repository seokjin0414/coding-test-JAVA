class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int dep = Math.abs(n - answer);
        
        for (int i : array) {
            int r = Math.abs(n - i);
            if (dep == r) {
                answer = Math.min(answer, i);
            } else if (dep > r) {
                answer = i;
                dep = r;
            }
        }
        
        return answer;
    }
}