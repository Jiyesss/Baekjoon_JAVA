import java.util.Scanner;

public class 백준_2562번 {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[9];
            int max = 0;
            int index = 0;
            for (int i = 0; i < 9; i++) {
                numbers[i] = scanner.nextInt();
                if (numbers[i] > max) {
                    max = numbers[i];
                    index = i + 1;

                }
            }
                System.out.println(max);
                System.out.println(index);



        }
    }
}
