class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int n = 0;
        String[] arr = polynomial.split(" ");

        for (String s : arr) {
            if (s.equals("+")) {
                continue;
            } else if (s.contains("x")) {
                if (s.length() == 1) {
                    x++;
                } else {
                    x += Integer.parseInt(s.replace("x", ""));
                }
            } else {
                n += Integer.parseInt(s);
            }
        }

        if (x > 1) {
            answer =  String.valueOf(x)+ "x";
        } else if (x == 1) {
            answer = "x";
        }
        
        if (n > 0) {
            if (answer.length() > 0) {
                answer += " + " + String.valueOf(n);
            } else {
                answer = String.valueOf(n);
            }
        }
        
        return answer;
    }
}