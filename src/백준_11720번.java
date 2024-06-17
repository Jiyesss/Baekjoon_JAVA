import java.util.Scanner;

public class 백준_11720번 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String number = scanner.next();

            int sum = 0;
            for (int i = 0; i< n; i++) {
                sum +=  Character.getNumericValue(number.charAt(i));
            }
            System.out.println(sum);


            scanner.close();
        }
    }
}
