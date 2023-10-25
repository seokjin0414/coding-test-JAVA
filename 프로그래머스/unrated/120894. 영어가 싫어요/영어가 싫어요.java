class Solution {
    public long solution(String numbers) {
        String[] match = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < match.length; i++) {
            numbers = numbers.replaceAll(match[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}