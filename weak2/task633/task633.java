import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;
class task633 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        double e = scanner.nextDouble();
        double step = x;
        double ans = x;
        int sign = -1;
        int n = 1;
        int oddFac = n;
        int evenFac = n + 1;
        double xPow = x * x * x;
        double tmp = step = sign * xPow * oddFac / evenFac / (2 * n + 1);
        while (Math.abs(tmp) >= e) {
            step = sign * xPow * oddFac / evenFac / (2 * n + 1);
            ans += step;

            sign *= -1;
            n++;
            oddFac *= 2 * n - 1;
            evenFac *= 2 * n;
            xPow *= x * x;
            tmp = sign * xPow * oddFac / evenFac / (2 * n + 1);
        }

        System.out.printf(Locale.US,"%.6f\n", ans);
        scanner.close();
    }
}
