class Solution {
    public int solution(String binomial) {
        int i = binomial.indexOf(" ");
        String s = binomial.substring(i + 1, i + 2);

        if (s.equals("+")) {
            return Integer.parseInt(binomial.substring(0, i)) +  Integer.parseInt(binomial.substring(i + 3));
        } else if (s.equals("-")) {
            return Integer.parseInt(binomial.substring(0, i)) -  Integer.parseInt(binomial.substring(i + 3));
        } else {
            return Integer.parseInt(binomial.substring(0, i)) *  Integer.parseInt(binomial.substring(i + 3));
        }
    }
}