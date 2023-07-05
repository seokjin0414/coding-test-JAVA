import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String dartResult) {
        String[] tokens = dartResult.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)|(?=[*#])|(?<=[*#])");
        String twice = "*";
        String minus = "#";

        Map<String, Integer> map = new HashMap<>();
        map.put("S", 1);
        map.put("D", 2);
        map.put("T", 3);
        map.put(twice, 2);
        map.put(minus, -1);

        int answer = 0;
        double foward = 0.0;

        for (int i = 0; i < tokens.length; ) {
            if (i+2 <= tokens.length-1) {
                String s = tokens[i + 2];
                
                if (s.equals(twice) || s.equals(minus)) {
                    if (s.equals(twice)) {
                        answer += foward;
                    }
                    foward = Math.pow(Integer.parseInt(tokens[i]), map.get(tokens[i+1])) * map.get(s);
                    i += 3;
                } else {
                    foward = Math.pow(Integer.parseInt(tokens[i]), map.get(tokens[i+1]));
                    i += 2;
                }
            } else {
                foward = Math.pow(Integer.parseInt(tokens[i]), map.get(tokens[i+1]));
                i += 2;
            }

            answer += foward;
        }

        return answer;
    }
}