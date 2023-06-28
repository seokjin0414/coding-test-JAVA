class Solution {
    public int solution(int[] nums) {
        int answer = 0;

       for (int i=0; i<nums.length-2; i++)
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int n = nums[i] + nums[j] + nums[k];
                    
                    if (n % 2 == 0) {
                        continue;
                    }
                    
                    int cnt = 0;
                    
                    for (int a=3; a<=Math.sqrt(n); a+=2) {
                        if (n % a == 0) {
                            cnt++;
                            break;
                        }
                    }
                    
                    if (cnt == 0) {
                        answer++;
                    }
                }
            }
        
        return answer;
    }
}