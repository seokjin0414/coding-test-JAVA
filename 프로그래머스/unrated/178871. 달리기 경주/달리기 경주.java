import java.util.HashMap;
import java.util.Map;

class Solution {
    public Object solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();

        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }

        for (String s : callings) {
            int r = map.get(s);
            String front = players[r-1];

            players[r-1] = s;
            players[r] = front;

            map.put(s,r-1);
            map.put(front,r);
        }

        return players;
    }
}