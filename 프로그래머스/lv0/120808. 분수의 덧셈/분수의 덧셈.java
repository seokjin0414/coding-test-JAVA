class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = (numer1 * denom2) + (numer2 * denom1);
        int b = denom1 * denom2;
        int n1 = Math.max(a, b);
        int n2 = Math.min(a, b);

        while (n2 != 0) {
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }

        answer[0] = a / n1;
        answer[1] = b / n1;

        return answer;
    }
}