class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int n = 0;

            if (arr[1].equals("+")) {
                n = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            } else {
                n = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            }

            if (n == Integer.parseInt(arr[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}