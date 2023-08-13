import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #").append(i).append(": ").append((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append("\n");
        }
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}