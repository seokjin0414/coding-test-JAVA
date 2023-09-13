class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < 52; i++) {
            answer[i] = 0;
        }
        

        for (char c : my_string.toCharArray()) {
            if (c < 91) {
                answer[c - 65] = answer[c - 65] + 1;
            } else {
                answer[c - 71] = answer[c - 71] + 1;
            }
        }

        return answer;
    }
}