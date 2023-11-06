class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int l = board.length;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (board[i][j] != 1) {
                    if (l == 1) {
                        answer++;
                        continue;
                    }
                    if (i > 0) {
                        if (i < l - 1) {
                            if (j > 0) {
                                if (j < l - 1) {
                                    if (board[i - 1][j] == 0 && board[i - 1][j + 1] == 0 && board[i - 1][j - 1] == 0 && board[i][j + 1] == 0 && board[i][j - 1] == 0 && board[i + 1][j] == 0 && board[i + 1][j - 1] == 0 && board[i + 1][j + 1] == 0) {
                                        answer++;
                                    }
                                } else {
                                    if (board[i - 1][j - 1] == 0 && board[i - 1][j] == 0 && board[i][j - 1] == 0 && board[i + 1][j] == 0 && board[i + 1][j - 1] == 0) {
                                        answer++;
                                    }
                                }
                            } else {
                                if (board[i - 1][j] == 0 && board[i - 1][j + 1] == 0 && board[i][j + 1] == 0 && board[i + 1][j] == 0 && board[i + 1][j + 1] == 0) {
                                    answer++;
                                }
                            }
                        } else {
                            if (j > 0) {
                                if (j < l - 1) {
                                    if (board[i - 1][j] == 0 && board[i - 1][j + 1] == 0 && board[i - 1][j - 1] == 0 && board[i][j + 1] == 0 && board[i][j - 1] == 0) {
                                        answer++;
                                    }
                                } else {
                                    if (board[i - 1][j - 1] == 0 && board[i - 1][j] == 0 && board[i][j - 1] == 0) {
                                        answer++;
                                    }
                                }
                            } else {
                                if (board[i - 1][j] == 0 && board[i - 1][j + 1] == 0 && board[i][j + 1] == 0) {
                                    answer++;
                                }
                            }
                        }
                    } else {
                       if (j > 0) {
                           if (j < l - 1) {
                               if (board[i][j + 1] == 0 && board[i][j - 1] == 0 && board[i + 1][j] == 0 && board[i + 1][j - 1] == 0 && board[i + 1][j + 1] == 0) {
                                   answer++;
                               }
                           } else {
                               if (board[i][j - 1] == 0 && board[i + 1][j] == 0 && board[i + 1][j - 1] == 0) {
                                   answer++;
                               }
                           }
                       } else {
                           if (board[i][j + 1] == 0 && board[i + 1][j] == 0 && board[i + 1][j + 1] == 0) {
                               answer++;
                           }
                       }
                    }
                }
            }
        }

        return answer;
    }
}