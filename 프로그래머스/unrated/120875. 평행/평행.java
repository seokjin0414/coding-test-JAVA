class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
       if (gradient(dots[0], dots[1]).equals(gradient(dots[2], dots[3])) || gradient(dots[0], dots[2]).equals(gradient(dots[1], dots[3])) || gradient(dots[0], dots[3]).equals(gradient(dots[1], dots[2]))) {
            answer = 1;
        }
        
        return answer;
    }

    static Double gradient(int[] a, int[] b) {
        return (double) (a[1] - b[1]) / (double) (a[0] - b[0]);
    }
}