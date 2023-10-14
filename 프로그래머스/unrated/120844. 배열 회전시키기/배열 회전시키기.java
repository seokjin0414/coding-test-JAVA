class Solution {
    public int[] solution(int[] numbers, String direction) {
        int line = numbers.length;
        int[] answer = new int[line];

        if (direction.equals("right")) {
            for (int i = 0; i < line; i++) {
                if (i == line - 1) {
                    answer[0] = numbers[i];
                } else {
                    answer[i + 1] = numbers[i];
                }
            }
        } else {
            for (int i = 0; i < line; i++) {
                if (i == 0) {
                    answer[line - 1] = numbers[i];
                } else {
                    answer[i - 1] = numbers[i];
                }
            }
        }
        return answer;
    }
}