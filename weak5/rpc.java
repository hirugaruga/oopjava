import java.util.Scanner;
import java.util.HashMap;
import java.lang.Math;

class Rpc {
    public static boolean messageHandler(String str) {
        if (str.equals("0") || str.toLowerCase().equals("rock")) {
            return false;
        } else if (str.equals("1") || str.toLowerCase().equals("scissors")) {
            return false;
        } else if (str.equals("2") || str.toLowerCase().equals("paper")) {
            return false;
        } else {
            return true;
        }
    }

    public static String messageSituation(int p, int ai) {
        if (p > ai) {
            return "in favor of the player";
        } else if (p < ai) {
            return "in favor of the computer";
        } else {
            return "draw";
        }
    }

    public static int strToInt(String str) {
        if (str.equals("0") || str.toLowerCase().equals("rock")) {
            return 0;
        } else if (str.equals("1") || str.equals("scissors")) {
            return 1;
        } else {
            return 2;
        }
    }
    public static String result(int[][] m, int i, int j) {
        if (m[i][j] == 0) {
            return "Lose";
        } else if (m[i][j] == 1) {
            return "Win";
        } else {
            return "Draw";
        }
    }


    public static void roundAnnouncer(int round) {

    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 3);
    }

    public static void main(String[] args) {
        System.out.print("Welcome to rock paper scissors, we play untill three wins.\n");
        int aiScore = 0;
        int pScore = 0;
        int round = 1;
        HashMap<Integer, String> rA = new HashMap<>();
        rA.put(1, "First ");
        rA.put(2, "Second ");
        rA.put(3, "Third ");
        rA.put(4, "Fourth ");
        rA.put(5, "Fifth ");
        rA.put(6, "Sixth ");
        rA.put(7, "Seventh ");
        rA.put(8, "Rock");
        rA.put(9, "Scissors");
        rA.put(10, "Paper");


        int[][] matrix = {{9, 1, 0}, {0, 9, 1}, {1, 0, 9}};

        while (aiScore != 2 && pScore != 2) {
            System.out.print("#====================================================================================#\n");
            System.out.print(rA.get(round));
            System.out.printf("round current score %d : %d %s\n", pScore, aiScore, messageSituation(pScore, aiScore));
            System.out.print("Your turn, type: Rock or Scissors or Paper, or their corresponding codes 0, 1, 2\n");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();
            int flag = 0;
            while (messageHandler(action)) {
                System.out.print("Incorrect input, try again.\n" +
                        "Your turn, type: Rock or Paper or Scissors, or their corresponding codes 0, 1, 2\n");
                flag++;
                action = scanner.nextLine();
                if (flag > 10) {
                    System.out.println("You so bad for this game");
                    return;
                }
            }
            int computerTurn = (int) (Math.random() * 3);
            String res = result(matrix, strToInt(action), computerTurn);
            System.out.printf("Player throw %s. Computer throw %s. Result: player is %s round\n", rA.get(strToInt(action)+8),
                    rA.get(computerTurn+8), res  );

            if (res == "Win") {
                pScore++;
            } else if (res == "Lose") {
                aiScore++;
            }
            round++;
            System.out.print("#====================================================================================#\n");
        }
        if (aiScore > pScore) {
            System.out.print("Computer is winner");
        } else {
            System.out.print("Player is winner");
        }
    }

}