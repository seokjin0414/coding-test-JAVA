class Solution {
    public int solution(int[] num_list) {
        StringBuilder o = new StringBuilder();
        StringBuilder e = new StringBuilder();

        for (int i : num_list) {
            if (i % 2 == 0) {
                e.append(i);
            } else {
                o.append(i);
            }
        }

        return Integer.parseInt(o.toString()) + Integer.parseInt(e.toString());

    }
}