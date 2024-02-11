import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int a, b;
        StreamTokenizer st = new StreamTokenizer(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            st.nextToken();
            a = (int) st.nval;

            if(a == 0) {
                break;
            }

            st.nextToken();
            b = (int) st.nval;

            bw.write((a +  b) + "\n");
        }

        bw.flush();
        bw.close();
    }
}