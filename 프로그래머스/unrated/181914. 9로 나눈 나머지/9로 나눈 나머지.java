class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for (char c : number.toCharArray()) {
            answer += (c - 48);
        }
        
        return answer % 9;
    }
}