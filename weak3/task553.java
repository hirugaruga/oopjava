import java.util.Locale;
import java.util.Scanner;

class task553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sign = 0;
        double ans = 0;
        for (int i = 1; i < n + 1; i++) {
            double denominator = 1.0;
            for (int k = 0; k < i; k++) {
                denominator *= 1.0 / i;
            }
            ans += denominator;
        }
        System.out.printf(Locale.US, "%.6f", ans);
        scanner.close();
    }
}