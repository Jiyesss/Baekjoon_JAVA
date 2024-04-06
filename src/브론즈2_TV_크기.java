import java.util.Scanner;
public class 브론즈2_TV_크기 {

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int D = scanner.nextInt();
            int H = scanner.nextInt();
            int W = scanner.nextInt();

            scanner.close();

            double length = Math.sqrt((double) D * D / (H * H + W * W));
            System.out.println((int) Math.floor(length * H) + " " + (int) Math.floor(length * W));
        }


    }

}