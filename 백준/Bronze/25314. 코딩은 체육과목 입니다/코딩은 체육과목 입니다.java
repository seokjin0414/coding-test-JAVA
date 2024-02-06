import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String l = "long ";
        String i = "int";
        int n = Integer.parseInt(br.readLine()) / 4;
        
        while (n > 0) {
            bw.write(l);
            n--;
        }
        bw.write(i);
        bw.flush();
        br.close();
        bw.close();
    }
}