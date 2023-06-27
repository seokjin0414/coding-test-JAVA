import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();

        Map<Character,Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i=0; i<survey.length; i++) {
            char nC = survey[i].charAt(0);
            char fC = survey[i].charAt(1);
            int n = choices[i];

            if (n < 4) {
                map.put(nC, map.get(nC)+((4-n)%4));
            } else if (n > 4) {
                map.put(fC, map.get(fC)+(n%4));
            }
        }

        if (map.get('R') >= map.get('T')) {
            sb.append('R');
        } else {
            sb.append('T');
        }
        if (map.get('C') >= map.get('F')) {
            sb.append('C');
        } else {
            sb.append('F');
        }
        if (map.get('J') >= map.get('M')) {
            sb.append('J');
        } else {
            sb.append('M');
        }
        if (map.get('A') >= map.get('N')) {
            sb.append('A');
        } else {
            sb.append("N");
        }
        
        return sb.toString();
    }
}