import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


class Dispersion {
    public static void main(String[] args) {
        System.out.println("Hello, i am program, which count Mean and Deviation of N numbers.\n" +
                "Please, enter N, after that N numbers:");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        double sum = 0;
        double sqSum = 0;
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            sum += x;
            sqSum += x * x;
        }
        double mean = sum / (double) n;
        double deviation = Math.sqrt((sqSum - (sum * sum) / n) / (n - 1));
        System.out.printf("Mean = %6f\n", mean);
        System.out.printf("Deviation = %6f\n", deviation);

    }
}