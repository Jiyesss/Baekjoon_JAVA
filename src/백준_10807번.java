import java.util.Scanner;

public class 백준_10807번 {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n  = scanner.nextInt();
            int[] numbers = new int[n];
            for (int i=0;i < n; i++) {
                numbers[i] = scanner.nextInt();

            }
            int v = scanner.nextInt();
            int count = 0;
            for (int number : numbers) {
                if (number == v) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
