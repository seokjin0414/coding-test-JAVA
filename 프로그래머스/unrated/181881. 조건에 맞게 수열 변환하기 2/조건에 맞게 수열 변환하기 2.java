import java.util.Arrays;
class Solution {
    private int[] filter (int[] arr) {
        int[] a = arr.clone();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] >= 50) {
                    a[i] = a[i] / 2;
                }
            } else {
                if (50 > a[i]) {
                    a[i] = (a[i] * 2) + 1;
                }
            }
        }
        return a;
    }

    public int solution(int[] arr) {
        int n = 0;

        while (true) {
            if (Arrays.equals(arr, filter(arr))) {
                return n;
            }
            arr = filter(arr);
            n++;
        }
    }
}