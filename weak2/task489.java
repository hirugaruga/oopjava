import java.util.Scanner;


class Task489 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        int counter = 0;
        for (String word : words) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                counter += 1;
            }
        }
        System.out.println(counter);
        scanner.close();

    }
}