class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("B", "b");
        myString = myString.replaceAll("A", "B");
        myString = myString.replaceAll("b", "A");

        return myString.contains(pat) ? 1 : 0;
    }
}