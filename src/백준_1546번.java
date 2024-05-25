import java.util.Scanner;

public class 백준_1546번 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            double[] scores = new double[N];

            for (int i = 0; i < N; i++) {
                scores[i] = scanner.nextDouble();
            }

            // 최댓값 M 찾기
            double M = 0;
            for (int i = 0; i < N; i++) {
                if (scores[i] > M) {
                    M = scores[i];
                }
            }

            double sum = 0;
            for (int i = 0; i < N; i++) {
                scores[i] = scores[i] / M * 100;
                sum += scores[i];
            }

            // 새로운 평균 출력
            System.out.println(sum / N);

            scanner.close();
        }
    }
}
