class Solution {
    public int[] solution(int[] num_list) {
        int e = 0;
        int o = 0;
        
        for (int i : num_list) {
            if (i % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        
        int[] answer = {e, o};
        return answer;
    }
}