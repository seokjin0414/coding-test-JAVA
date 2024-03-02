import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList();
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < speeds.length; i++) {
            q.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }
       
        int cnt = 1;
        int done = q.poll();
        
        while (!q.isEmpty()) {
            if (done < q.peek()) {
                list.add(cnt);
                cnt = 1;
                done = q.poll();
            } else {
                cnt++;
                q.poll();
            }
        }
        
        list.add(cnt);
        
        return list;
    }
}