import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class 백준_3052번 {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<Integer> remainders = new HashSet<>();

            for (int i = 0; i < 10; i++) {
                int number = scanner.nextInt();
                int remainder = number % 42;
                remainders.add(remainder);
            }

            System.out.println(remainders.size());

            scanner.close();
        }
    }

}
