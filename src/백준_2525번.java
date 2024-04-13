import java.util.Scanner;

public class 백준_2525번 {
    class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int endH = A;
            int endM = B+C;

            if (endM >= 60) {
                endH += endM / 60;
                endM %= 60;
            }

            if (endH > 23) endH -= 24;
            System.out.println(endH + " " +endM);
        }

    }
}
