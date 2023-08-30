import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String a = new BufferedReader(new InputStreamReader(System.in)).readLine();
        
        StringBuilder sb = new StringBuilder();

        for (char c : a.toCharArray()) {
            sb.append((char) (c < 97 ? c + 32 : c -32));
        }
        
        System.out.println(sb.toString());
    }
}