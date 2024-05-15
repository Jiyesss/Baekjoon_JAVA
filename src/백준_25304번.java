import java.util.Scanner;

public class 백준_25304번 {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int price = 0;
            int x  = scanner.nextInt();
            int n  = scanner.nextInt();


            for (int i =0; i < n; i++) {
                int a  = scanner.nextInt();
                int b  = scanner.nextInt();
                price += a * b;
            }

            System.out.println((price == x) ? "Yes": "No");
        }

    }
}
