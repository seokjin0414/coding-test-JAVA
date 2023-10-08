class Solution {
    public int solution(String[] order) {
        int a = 0;
        int l = 0;

        for (String s : order) {
            if (s.contains("latte")) {
                l++;
            } else {
                a++;
            }
        }

        return 4500 * a + 5000 * l;
    }
}