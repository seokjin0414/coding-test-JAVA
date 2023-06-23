import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger aa = new BigInteger(a).add(new BigInteger(b));
        return aa.toString();
    }
}