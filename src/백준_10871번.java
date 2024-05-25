import java.util.Scanner;

public class 백준_10871번 {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n  = scanner.nextInt();
            int[] numbers = new int[n];
            int x = scanner.nextInt();
            int count = 0;
            for (int i=0;i < n; i++) {
                numbers[i] = scanner.nextInt();
                if (numbers[i] < x) {
                    System.out.print(numbers[i]+ " ");
                }
            }

        }

    }
}
