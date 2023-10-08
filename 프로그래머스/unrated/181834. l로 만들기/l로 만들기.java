class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c < 108) {
                sb.append('l');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}