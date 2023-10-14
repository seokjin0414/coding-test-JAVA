class Solution {
    public int solution(int n) {
        int i = 1;
        int total = 1;

        while (total <= n) {
            i++;
            total *= i;
        }
        i--;

        return i;
    }
}