class Solution {
    public long solution(int price, int money, int count) {
        long l = price * (count+1);
        long ll = l * count;
        long answer = (ll / 2) - money;
        
        answer = answer > 0 ? answer : 0;

        return answer;
    }
}