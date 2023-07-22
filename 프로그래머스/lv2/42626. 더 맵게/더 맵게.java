import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int answer = 0;

        for (int i : scoville) {
            que.add(i);
        }
        
        while (que.peek() < K) {
            if (que.size() == 1) {
                return -1;
            }
            
            que.add(que.poll() + que.poll() * 2);
            answer++;
        }
        
        return answer;
    }
}