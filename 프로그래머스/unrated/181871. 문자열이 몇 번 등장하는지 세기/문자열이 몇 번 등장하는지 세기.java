class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int l = pat.length();
        
        for (int i = myString.indexOf(pat) != -1 ? myString.indexOf(pat) : 0 ; i <= myString.length() - l; i++) {
            if (myString.substring(i, i + l).equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}