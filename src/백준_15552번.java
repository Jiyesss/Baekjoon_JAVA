import java.io.*;

public class 백준_15552번 {
    class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int t = Integer.parseInt(br.readLine());

         for(int i = 0; i < t; i++) {
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                bw.write((a+b) + "\n");
            }
         bw.flush();
         bw.close();
         bw.close();



        }
    }
}
