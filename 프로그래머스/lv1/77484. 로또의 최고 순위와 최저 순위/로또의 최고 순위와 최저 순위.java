import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        int cnt = 0;
        int free = 0;

        for (int i=0; i<5; i++) {
            rankMap.put(6-i,i+1);
        }

        Arrays.parallelSort(win_nums);

        for (int n : lottos) {
            if (n == 0) {
                free++;
            } else if (Arrays.binarySearch(win_nums, n) >= 0){
                cnt++;
            }
        }
        
        int[] answer = new int[2];
        answer[0] = cnt + free >= 2 ? rankMap.get(cnt+free) : 6;
        answer[1] = cnt >= 2 ? rankMap.get(cnt) : 6;

        return answer;
    }
}