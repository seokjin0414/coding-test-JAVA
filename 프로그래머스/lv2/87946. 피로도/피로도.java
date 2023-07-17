class Solution {
    static boolean[] v;
    static int c;

    private void f(int d, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (v[i] || dungeons[i][0] > k) {
                continue;
            }

            v[i] = true;
            f(d + 1, k - dungeons[i][1],dungeons);
            v[i] = false;
        }
        c = Math.max(c, d);
    }

    public int solution(int k, int[][] dungeons) {
        v = new boolean[dungeons.length];
        c = 0;
        f(0, k, dungeons);

        return c;
    }
}