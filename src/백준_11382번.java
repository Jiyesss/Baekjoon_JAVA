import java.util.Scanner;

public class 백준_11382번 {
    class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // int로 받으면 범위가 작아서 런타임에러남
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            System.out.println((a+b+c));



        }
    }
}
