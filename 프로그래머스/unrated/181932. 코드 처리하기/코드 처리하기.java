class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = true;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                 mode = !mode;
            } else {
                if (mode) {
                    if (i % 2 == 0) {
                        sb.append(code.charAt(i));
                    }
                } else {
                    if (i % 2 != 0) {
                        sb.append(code.charAt(i));
                    }
                }
            }
        }

        if (sb.length() == 0) {
            return "EMPTY";
        }

        return sb.toString();
    }
}