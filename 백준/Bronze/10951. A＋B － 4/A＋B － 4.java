import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String l;

        while ((l = br.readLine()) != null) {
            a = l.charAt(0) - 48;
            b = l.charAt(2) - 48;

            bw.write((a +  b) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}