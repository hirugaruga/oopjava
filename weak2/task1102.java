import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

class Task1102 {
    public static boolean gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        double x = scanner.nextDouble();
        int numerator = 1;
        int denominator = 1;
        double dif = 10.0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                double tmpI = i;
                double tmpJ = j;
                double flag = Math.abs(tmpJ / tmpI - x);
                if (gcd(i, j) && Math.abs(tmpJ / tmpI - x) < dif) {
                    dif = Math.abs(tmpJ / tmpI - x);
                    numerator = j;
                    denominator = i;
                }
            }
        }
        System.out.print(numerator);
        System.out.print(' ');
        System.out.print(denominator);


    }
}