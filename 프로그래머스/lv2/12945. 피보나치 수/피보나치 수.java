class Solution {
    public int solution(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 1234567;

        while (n>1) {
            c = (a + b) % d;
            a = b % d;
            b = c;
            n--;
        }

        return c % d;
    }
}