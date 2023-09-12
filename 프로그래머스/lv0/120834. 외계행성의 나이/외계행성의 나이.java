class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : String.valueOf(age).toCharArray()) {
            sb.append((char) (c + 49));
        }

        return sb.toString();
    }
}