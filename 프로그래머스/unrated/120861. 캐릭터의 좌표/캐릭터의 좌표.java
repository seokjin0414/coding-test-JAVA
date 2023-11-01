class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        board[0] = board[0] / 2;
        board[1] = board[1] / 2;
        int[] answer = {0, 0};
        
        for (String s : keyinput) {
            if (s.equals("right")) {
                answer[0] = answer[0] + 1 > board[0] ? answer[0] : answer[0] + 1;
            } else if (s.equals("left")) {
                answer[0] = Math.abs(answer[0] - 1) > board[0] ? answer[0] : answer[0] - 1;
            } else if (s.equals("up")) {
                answer[1] = answer[1] + 1 > board[1] ? answer[1] : answer[1] + 1;
            } else {
                answer[1] = Math.abs(answer[1] - 1) > board[1] ? answer[1] : answer[1] - 1;
            }
        }
        
        return answer;
    }
}