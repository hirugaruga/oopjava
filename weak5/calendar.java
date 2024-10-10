import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


class Calendar {
    public static HashMap<Integer, Integer> generationYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return monthDays(true);
        } else {
            return monthDays(false);
        }
    }

    public static HashMap<Integer, Integer> monthDays(boolean flag) {
        HashMap<Integer, Integer> map = new HashMap();
        if (flag) {
            map.put(0, 31);
            map.put(1, 29);
            map.put(2, 31);
            map.put(3, 30);
            map.put(4, 31);
            map.put(5, 30);
            map.put(6, 31);
            map.put(7, 31);
            map.put(8, 30);
            map.put(9, 31);
            map.put(10, 30);
            map.put(11, 31);
        } else {
            map.put(0, 31);
            map.put(1, 28);
            map.put(2, 31);
            map.put(3, 30);
            map.put(4, 31);
            map.put(5, 30);
            map.put(6, 31);
            map.put(7, 31);
            map.put(8, 30);
            map.put(9, 31);
            map.put(10, 30);
            map.put(11, 31);
        }
        return map;
    }

    public static Map months() {
        Map map = new HashMap();
        map.put(0, "January");
        map.put(1, "February");
        map.put(2, "March");
        map.put(3, "April");
        map.put(4, "May");
        map.put(5, "June");
        map.put(6, "July");
        map.put(7, "August");
        map.put(8, "September");
        map.put(9, "October");
        map.put(10, "November");
        map.put(11, "December");
        return map;
    }

    public static String presentaionNumber(int num) {
        if (num / 10 == 0) {
            return "  " + Integer.toString(num) + ' ';
        } else {
            return " " + Integer.toString(num) + ' ';
        }
    }

    public static String spaces(int num) {
        String string = "                                               ";
        return string.substring(0, num * 4);
    }

    public static void main(String[] args) {
        System.out.print("Hello, i am a program, which print calendar.\nPlease, input year and day, which start year: \n");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();
        HashMap<Integer, Integer> net = generationYear(year);
        Map nameMonth = months();
        int tmp = day % 7;
        for (int i = 0; i < 12; i++) {
            System.out.printf("%s %d\n", nameMonth.get(i), year);
            System.out.print("Sun Mon Tue Wed Thu Fri Sat\n");
            boolean flag = false;
            boolean flag1 = true;
            if (tmp < 7) {
                System.out.print(spaces(tmp));
                flag = false;
                flag1 = false;
            }
            int counter = 0;

            for (int j = 0; j < net.get(i); j++) {
                if (((j + tmp) % 7 == 0) && flag) {
                    System.out.print('\n');
                    counter++;
                }
                flag = true;
                System.out.print(presentaionNumber(j + 1));
            }
            //System.out.println(counter);
            if (counter > 4 || flag1) {
                System.out.println(spaces(42 - net.get(i) - tmp));
                tmp = 7 - (42 - net.get(i) - tmp);
            } else {
                System.out.println(spaces(35 - net.get(i) - tmp));
                tmp = 7 - (35 - net.get(i) - tmp);
            }

        }

    }
}