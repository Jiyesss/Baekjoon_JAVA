import java.util.Scanner;

public class 백준_10810번 {

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[] baskets = new int[N];

            for (int m = 0; m < M; m++) {
                // i, j, k 입력받음
                int i = scanner.nextInt();
                int j = scanner.nextInt();
                int k = scanner.nextInt();

                for (int index = i - 1; index < j; index++) {
                    baskets[index] = k;
                }
            }

            for (int num : baskets) {
                System.out.print(num + " ");
            }
            scanner.close();
        }
    }

}
