import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

class Task425 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = Integer.parseInt(str);
        double max = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            String tmpString = scanner.next();
            double tmp = Double.parseDouble(tmpString);
            if (flag) {
                max = tmp;
                flag = false;
            }
            else {
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        if (Math.abs(max) > 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}