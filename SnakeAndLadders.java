
/** Snake and Ladders game,6th game in making. Dated 03-05-2015
 * v1.0 Started 03-05-2015
   To do:- Show proper board,include single player mode **Will do later** too and case-centric exception handling 
   so that only the error is fixed and inputs are not taken all over again**To be done**.
   Done:
     27-05-2015 Board Pattern matched but spaces remain probelm. 
     29-05-2015 Board Pattern perfected. Random L and S working fine,for now. Ranging the values of L,S,counters from 1 to 100 remains
     30-05-2015 No >100 or <0 number displayed. Error at 99,Snake doesn't bite.(Fixed)
     01-06-2015 2-play ready to release MRP 20 Rupees. 
* v1.01 Update includes snake at 99...no snake makes you climb(improved min and max values for random)
* v1.02 Update includes board show after every move.
* v1.1.0 to include 2-4 player input.
* v1.2.0 to include 1 player input.
Edited on 29/7/19
*/
import java.util.Scanner;

class SnakeAndLadders {
    private int i, num, count1, count2, move;
    private java.lang.String p1, p2;
    private static Scanner read = new Scanner(System.in);

    SnakeAndLadders() {
        i = 0;
        num = 0;
        count1 = 0;
        count2 = 0;
        move = 0;
        p1 = "";
        p2 = "";
    }

    public static void main(String args[]) {
        SnakeAndLadders obj = new SnakeAndLadders();
        obj.starter();
    }

    void starter() {
        try {
            rules();
            System.out.println("Enter your name,Player 1:");
            p1 = read.nextLine();
            System.out.println("Enter your name,Player 2:");
            p2 = read.nextLine();
            showBoard();
            playGame();
        } catch (Exception e) {
            System.out.println("Invalid Input.");
            starter();
        }
    }

    void rules() {
        System.out.println("For now,two players can play this game.");
        System.out.println("You can not continue your turn if you get a six!");
        System.out.println("L means Ladder and S means Snake");
        System.out.println("###The place where L and S take you is completely random.###");
        System.out.println("This means you can win by climbing first ladder or last snake can drag you down to 1");
        System.out.println(
                "If a snake puts you on a ladder position, you can't climb the ladder. Similarly, if a ladder takes you to snake,sanke won't bite you!");
    }

    void showBoard() {
        i = 100;
        for (; i > 90; i--) {
            if (i == 100)
                System.out.print(i + " ");
            else if (i == 91 || i == 99)
                System.out.print("S   ");
            else
                System.out.print(i + "  ");
        }
        System.out.println();
        while (i >= 10) {
            if (i != 90)
                odd();
            i -= 10;
            if (i == 0)
                break;
            even();
            i -= 10;
        }
        for (; i < 10; i++) {
            if (i == 8 || i == 1)
                System.out.print("L   ");
            else
                System.out.print(i + 1 + "   ");
        }
        System.out.println();
    }

    void even() {
        for (int n = i + 1; n <= i + 10; n++) {
            if (n % 10 == 0)
                System.out.println(n + "   ");
            else if (n == 49 || n == 24)
                System.out.print("S   ");
            else if (n == 45 | n == 22)
                System.out.print("L   ");
            else
                System.out.print(n + "  ");
        }
    }

    void odd() {
        for (int n = i + 10; n >= i + 1; n--) {
            if (n % 10 == 1)
                System.out.println(n + "   ");
            else if (n == 14)
                System.out.print("L   ");
            else if (n == 72 || n == 57)
                System.out.print("S   ");
            else
                System.out.print(n + "  ");
        }
    }

    int checkSorL(int x) {
        if (x == 2 || x == 9 || x == 14 || x == 22 || x == 45) {
            System.out.println("You climb the ladder!");
            int r = x + (int) (Math.random() * (100 - x) - 1);
            while (x + r > 100) {
                r = x + (int) (Math.random() * (100 - x) - 1);
            }
            return r;
        } else if (x == 24 || x == 49 || x == 57 || x == 72 || x == 91 || x == 99) {
            System.out.println("You were bitten by snake!");
            int r = -(x - (int) (Math.random() * (x - 1) - 1));
            while (x + r < 0) {
                r = -(x - (int) (Math.random() * (x - 1) - 1));
            }
            return r;
        }
        return 0;
    }

    void playGame() {
        try {
            if (num % 2 == 0)
                System.out.println("The dice is rolling,press enter to stop it, or type exit to quit, " + p1);
            else
                System.out.println("The dice is rolling,press enter to stop it, or type exit to quit, " + p2);
            java.lang.String stopper = read.nextLine();
            if (stopper.equalsIgnoreCase("exit"))
                System.out.println("See you soon!");
            else if (!(stopper.equals(""))) {
                System.out.println("Just press enter! Nothing else to be done");
                playGame();
            } else {
                showBoard();
                move = 1 + (int) (Math.random() * (6));
                System.out.println("You rolled a " + move);
                if (num % 2 == 0) {
                    count1 += move;
                    if (count1 > 100) {
                        System.out.println("Invalid");
                        count1 -= move;
                    } else
                        count1 += checkSorL(count1);
                } else {
                    count2 += move;
                    if (count2 > 100) {
                        System.out.println("Invalid");
                        count2 -= move;
                    } else
                        count2 += checkSorL(count2);
                }
                if (count1 == 100)
                    System.out.println(p1 + " won the game.");
                else if (count2 == 100)
                    System.out.println(p2 + " won the game.");
                else {
                    System.out.println(p1 + ", you are at " + count1 + " and " + p2 + ", you are at " + count2);
                    num++;
                    playGame();
                }
            }
        } catch (Exception e) {
            System.out.println("Error. Roll it again!");
            playGame();
        }
        read.close();
    }
}