class Solution {
    public String solution(String new_id) {
       String answer= new_id.replaceAll("[^a-zA-Z0-9\\-_.]", "");
        answer = answer.replaceAll("\\.{2,}", ".");

        while ((answer.startsWith(".") || answer.endsWith("."))) {
            answer = answer.replaceAll("^\\.|\\.$", "");
        }

        if (answer.length() == 0)  {
            return "aaa";
        } else if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }

        answer = answer.toLowerCase();

        while (answer.endsWith(".")) {
            answer = answer.replaceAll("\\.$", "");
        }

        if (answer.length() <= 2) {
            String s = String.valueOf(answer.charAt(answer.length() - 1));
            answer += s.repeat(3-answer.length());
        }

        return answer;
    }
}