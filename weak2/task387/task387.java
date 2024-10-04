import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

class task387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if ((a >= -1.0) && (a <= 1.0) && (b >= -2.0) && (b <= 1.0)) {
            if (a - b < 0 && a + b > 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }
}
