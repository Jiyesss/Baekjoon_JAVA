import java.io.*;

public class 백준_10951번 {
    class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            String line;
            while((line = br.readLine()) != null) {

                String[] input = line.split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                bw.write(a+b + "\n");
         }

         bw.flush();
         bw.close();
         bw.close();



        }
    }
}
