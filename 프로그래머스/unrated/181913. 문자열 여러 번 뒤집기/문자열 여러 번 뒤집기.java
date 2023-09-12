class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] i : queries) {
            if (i[0] != i[1]) {
                StringBuilder sb = new StringBuilder(my_string.substring(i[0], i[1] + 1)).reverse();
                my_string = my_string.substring(0, i[0]) + sb.toString() + my_string.substring(i[1] + 1);
            }
        }

        return my_string;
    }
}