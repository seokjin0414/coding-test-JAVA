import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLine = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("*");
            sbLine.append(sb + "\n");
        }

        System.out.println(sbLine);
        br.close();
    }
}