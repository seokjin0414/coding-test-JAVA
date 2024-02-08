import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st.nextToken();
        int n = (int) st.nval;

        for (int i = 1; i <= n; i++) {
            st.nextToken();
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;
            
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }


        bw.flush();
        bw.close();
    }
}