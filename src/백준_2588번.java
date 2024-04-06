import java.util.Scanner;

public class 백준_2588번 {
    class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int real_b = b;
            int b_100 = b/100;
            b = b% 100;
            int b_10 = b / 10;
            b = b % 10;
            int b_1 = b;
            System.out.println((a*b_1));
            System.out.println((a*b_10));
            System.out.println((a*b_100));
            System.out.println((a*real_b));



        }
    }
}
