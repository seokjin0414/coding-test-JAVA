class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i].equals("Z") ? -Integer.parseInt(arr[i - 1]) : Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}