class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int answer = 0;
        
        for (int i = max - min + 1; i <= max; i++) {
            answer++;
        }
        
        if (1 < min) {
            for (int i = max + 1; i < max + min; i++) {
                answer++;
            }
        }
        
        return answer;
    }
}