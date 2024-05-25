import java.util.Scanner;

public class 백준_10818번 {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n  = scanner.nextInt();
            int[] numbers = new int[n];
            int min = 1000000;
            int max = -1000000;

            for (int i=0;i < n; i++) {
                numbers[i] = scanner.nextInt();
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println(min + " " + max);

        }

    }
}
