import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class task453 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        scaner.useLocale(Locale.US);
        int n = scaner.nextInt();
        double s = 0;
        for (int i = 0; i < n; i++) {
            double tmp = scaner.nextDouble();
            if (tmp > 0 && tmp <= 15) {
                s += (Math.sqrt(tmp) - tmp) * (Math.sqrt(tmp) - tmp);
            } else {
                tmp = 2.7;
                s += (Math.sqrt(tmp) - tmp) * (Math.sqrt(tmp) - tmp);
            }
        }
        System.out.printf(Locale.US, "%.6f", s);
    }
}
