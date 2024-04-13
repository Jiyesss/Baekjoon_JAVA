import java.util.Scanner;

public class 백준_2480번 {
    class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int price = 0;
            if (A == B && B == C) price += 10000 + A*1000;
            else if (A ==B) price += 1000 + A*100;
            else if (B ==C) price += 1000 + B*100;
            else if (C ==A) price += 1000 + C*100;
            else {
                if (A > B && A > C) price += A*100;
                else if (B > C && B > A) price += B*100;
                else price += C*100;
            }
            System.out.println(price);
        }

    }
}
