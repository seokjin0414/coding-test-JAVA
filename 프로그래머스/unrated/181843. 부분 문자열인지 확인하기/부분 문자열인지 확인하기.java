class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;

        if (my_string.indexOf(target) >= 0) {
            answer = 1;
        }

        return answer;
    }
}