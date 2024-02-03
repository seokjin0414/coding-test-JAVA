import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st.nextToken();
        int total = (int)st.nval;
        st.nextToken();
        int n = (int)st.nval;
        int sum = 0;

        for(int i = 0; i < n; i++){
            st.nextToken();
            int price = (int)st.nval;
            st.nextToken();
            int cnt= (int)st.nval;
            sum += (price * cnt);
        }
        if(total == sum) {
            bw.write("Yes");}
        else {
            bw.write("No");
        }
        bw.flush();
        bw.close();
    }
}