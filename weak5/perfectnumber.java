
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Perfectnumber {
    public static List<Long> devider(long n) {
        List<Long> arr = new ArrayList<Long>();
        for (long i = 1; i < (n / 2 + 1); i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static long sumList(List<Long> arr) {
        long sum = 0;
        for (long i = 0; i < arr.size(); i++) {
            sum += arr.get((int) i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello, i am program, which find all perfect\n" +
                "numbers from 1 to N. Please, input N:");

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();


        for (int i = 2; i < n; i++) {
//            System.out.print(i);
//            System.out.println(devider(i));

            if (i == sumList(devider(i))) {
                System.out.printf("%d ", i);
            }
        }
    }
}