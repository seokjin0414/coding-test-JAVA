import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine()) / 4;

        while (n > 0) {
            sb.append("long ");
            n--;
        }
        sb.append("int");

        System.out.println(sb);
        br.close();
    }
}