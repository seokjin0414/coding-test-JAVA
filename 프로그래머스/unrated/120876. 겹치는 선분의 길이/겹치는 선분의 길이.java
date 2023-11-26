class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] check = new int[200];

        for (int [] arr : lines) {
            int e = arr[1] + 100;
            for (int i = arr[0] + 100; i < e; i++) {
               check[i] += 1;
            }
        }

        for (int n : check) {
            if (n > 1) {
                answer++;
            }
        }

        return answer;
    }
}