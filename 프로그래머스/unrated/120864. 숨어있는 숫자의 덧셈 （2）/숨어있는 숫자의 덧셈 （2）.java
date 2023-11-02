class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] splitter = my_string.split("[a-zA-Z]");
        
        for (String s : splitter) {
            if (!s.equals("")) {
                answer += Integer.valueOf(s);
            }
        }

        return answer;
    }
}