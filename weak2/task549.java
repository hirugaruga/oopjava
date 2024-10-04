
import java.util.Scanner;
import java.util.Locale;

class task549 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();

        int n = 1;
        int fac = 1;
        double b = x;
        double ans = x;
        int sign = -1;
        for (int i = 0; i < 7; i++) {
            b *= x * x;
            fac *= (n + 1) * (n + 2);
            ans += sign * (b / fac);
            sign *= -1;
            n += 2;
        }
        System.out.printf(Locale.US, "%.6f", ans);
    }
}