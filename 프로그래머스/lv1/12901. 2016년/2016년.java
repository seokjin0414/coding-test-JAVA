class Solution {
    public String solution(int a, int b) {
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int n = -1;
        
        for (int i=0; i<a-1; i++) {
            n += day[i];
        }
        
        n += b;
        
        return week[n%7];
    }
}