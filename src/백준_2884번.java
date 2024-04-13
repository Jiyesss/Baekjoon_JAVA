import java.util.Scanner;

public class 백준_2884번 {
    class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int H = scanner.nextInt();
            int M = scanner.nextInt();
            int eH = 0;
            int eM = 0;
            if (H == 0 && M < 45) {
                eH = 23;
                eM = M + 60 - 45;
            }
            else if (M < 45) {
                eH = H - 1;
                eM = M + 60 - 45;
            }
            else {
                eH = H;
                eM = M - 45;
            }
            System.out.println(eH+ " " + eM);

        }
    }
}
