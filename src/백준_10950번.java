import java.util.Scanner;

public class 백준_10950번 {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T  = scanner.nextInt();
            int[] adder = new int[T];

            for (int i =0; i < T; i++) {
                int a  = scanner.nextInt();
                int b  = scanner.nextInt();
                adder[i] = a + b;
            }

            for (int add : adder) {
                System.out.println(add);
            }
        }

    }
}
