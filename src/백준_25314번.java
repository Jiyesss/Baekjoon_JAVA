import java.util.Scanner;

public class 백준_25314번 {
    class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int say = n / 4;
            for (int i = 0; i < say; i++) {
                System.out.print("long ");
            }
            System.out.println("int");




        }
    }
}
