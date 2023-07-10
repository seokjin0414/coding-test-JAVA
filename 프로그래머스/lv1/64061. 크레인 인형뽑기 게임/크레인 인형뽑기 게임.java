import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> my = new ArrayDeque<>();
        int answer = 0;

        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                int pick = board[j][i-1];
                if (pick != 0) {
                    if (my.size() > 0 && pick == my.getLast()) {
                        my.removeLast();
                        answer+=2;
                    } else {
                        my.add(pick);
                    }
                    board[j][i-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}