import java.util.Scanner;

public class 백준_10811번 {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] baskets = new int[N];

            for (int i = 0; i < N; i++) {
                baskets[i] = i + 1;
            }

            for (int m = 0; m < M; m++) {
                int i = scanner.nextInt() - 1;
                int j = scanner.nextInt() - 1;

                // i부터 j까지의 배열을 역순으로 만듦
                while (i < j) {
                    int temp = baskets[i];
                    baskets[i] = baskets[j];
                    baskets[j] = temp;
                    i++;
                    j--;
                }
            }

            for (int basket : baskets) {
                System.out.print(basket + " ");
            }

            scanner.close();
        }
    }


}
