import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

class task559 {
    static public double rpc(int start, int end) {
        if (start == end) {
            double z = (double) Math.pow(2, end) + (1.0 / (double) Math.pow(2, end + 1));
            return z;
        } else {
            double k = Math.pow(2, start) + 1.0 / rpc(start + 1, end);
            return k;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int d = scanner.nextInt();
        double k = rpc(0,d);
        System.out.printf(Locale.US, "%.6f", 1/k);
        System.out.println(Math.pow(2,0));
    }
}