import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int line = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if (line == sum) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}