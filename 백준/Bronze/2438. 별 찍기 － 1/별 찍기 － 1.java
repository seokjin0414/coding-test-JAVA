import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            cnt = i;
            while (cnt > 0) {
                sb.append("*");
                cnt--;
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }
}