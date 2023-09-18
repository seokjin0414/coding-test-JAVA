class Solution {
    public int solution(int balls, int share) {
        return f(balls, share);
    }

    private int f(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return f((balls - 1), (share - 1)) + f(balls - 1, share);
    }
}