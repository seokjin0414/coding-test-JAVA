class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < num; i++) {
            y += i;
        }
        
        x = (total - y) / num;

        for (int j = 0; j < num; j++) {
            answer[j] = x + j;
        }
        
        return answer;
    }
}