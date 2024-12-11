import java.util.Locale;
import java.util.Scanner;

public class task441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        double r = 0;
        double s = 0;
        for (int i = 0; i < n; i++) {
            double tmp = scanner.nextDouble();
            if (tmp <= 1) {
                r += tmp;
            } else {
                s += tmp;
            }
        }
        System.out.printf(Locale.US, "%.6f", (1 + r) / (1 + s));
    }
}
