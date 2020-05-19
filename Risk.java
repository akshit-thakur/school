
/**Risk v1.0 **Descpription written 18-7-2015.**
 * Dice throwing game in which attacker has to roll dices having sum more than that of defender to win
   the territory.(If sums are equal, defender wins.)
 * Full game to have 4 modes:
  1. Total Conquest(All territories won)
  2. % territory(specified % of territory holder wins.)
  3. move based(Max moves predefined. Majority wins at the end.)
  4. indefinite(as long you don't press exit.)
 * In 2p game, computer holds unoccupied territory(barbarians). If player loses in an attack on him,
   he gets initiative to counter attack.
 * First attacker presses enter then defender and the results are shown collectively.
 * Demo game will have total % territory,2p game. Full game will have all modes and upto 8p
 
 ** Developer's notes:
 ** v1.0 started 19-8-15
 * First game using Scanner input. 
 * Territory bonus can be included in each initative to up the sums(21-8-15 edit : Can't find suitable bonus for territory holding)
 * Matrix display method and invoking AI remains.
 * 
 *************************CLASS DESCRIPTION************************* 19-8-15
 **********VARIABLES
 **********int dice1,dice2 ---Stores the number coming on each roll of dice
 **********sum1,sum2,sumC ----Stores the sum of two dices
 **********ter1,ter2,terC ----Stores the territory occupied
 **********total              Stores the total number of territories for the game.
 **********mark               Stores the victory mark(% of total OR total.)
 **********moves              Stores the no. of moves made(for move-based game) 
 **********flag               Stores the resume point of inputs by flagging what is inputed
 **********turn               Stores whose turn it is
 ********String
 ********p1,p2
 ****************FUNCTIONS
 ****************void starter()
 ****************void playPercent() 
 ****************void dispScore()
 ****************String rules()
 ****************String getWinner()
 */
import java.util.InputMismatchException;
import java.util.Scanner;

class Risk {
    int dice1, dice2, sum1, sum2, sumC, total, ter1, ter2, terC, mark, moves, flag, turn, bonus1, bonus2;
    java.lang.String p1, p2;

    Risk() {
        dice1 = 0;
        dice2 = 0;
        sum1 = 0;
        sum2 = 0;
        sumC = 0;
        ter1 = 0;
        ter2 = 0;
        terC = 0;
        total = 0;
        mark = 0;
        moves = 0;
        turn = 0;
        bonus1 = 0;
        bonus2 = 0;
        p1 = "";
        p2 = "";
    }

    public static void main(String args[]) {
        Risk obj = new Risk();
        obj.starter();
    }

    void starter() {
        try {
            Scanner read = new Scanner(System.in);
            switch (flag) {
            case 0:
                System.out.println("Enter name,player 1:");
                p1 = read.nextLine();
                flag = 1;
            case 1:
                System.out.println("Enter name,player 2:");
                p2 = read.nextLine();
                flag = 2;
            case 2:
                System.out.println("Enter number of total territories: ");
                total = read.nextInt();
                flag = 3;
            case 3:
                System.out.println("Enter %age of territories to decide winner: ");
                mark = (int) (read.nextInt() * (total)) / 100;
                flag = 4;
                rules();
                playPercent(); /* next method called */
            }
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            starter();
        }
    }

    void playPercent() {
        // bonus();
        Scanner read = new Scanner(System.in);
        System.out.println("Press enter to roll both dices or type exit to exit," + p1);
        java.lang.String roll = read.nextLine();
        if (roll.equalsIgnoreCase("exit"))
            System.out.println("See you soon");
        else {
            dice1 = 1 + (int) (Math.random() * (6));
            dice2 = 1 + (int) (Math.random() * (6));
            sum1 = dice1 + dice2 + bonus1;
            System.out.println("Press enter to roll both dices or type exit to exit," + p2);
            roll = read.nextLine();
            if (roll.equalsIgnoreCase("exit"))
                System.out.println("See you soon");
            else {
                dice1 = 1 + (int) (Math.random() * (6));
                dice2 = 1 + (int) (Math.random() * (6));
                sum2 = dice1 + dice2 + bonus2;
                if (sum1 > sum2 && turn % 2 == 0) {
                    System.out.println(p1 + " won territory");
                    ter1 += 1;
                } else if (sum1 < sum2 && turn % 2 != 0) {
                    System.out.println(p2 + " won territory");
                    ter2 += 1;
                } else {
                    if (turn % 2 == 0)
                        System.out.println(p2 + " retained territory");
                    else
                        System.out.println(p1 + " retained territory");
                }
                dispScore();
                if (flag != 1) {
                    turn += 1;
                    playPercent();
                }
            }
        }
        read.close();
    }

    void rules() {
        System.out.println(p1
                + " has first attacking initiative.\n Attacker has to roll dices having sum greater than that of defender's");
        System.out.println(
                "After each attack,the initiative changes to and fro.\n If sums are equal,the defender gets advantage.");
        System.out.println("The aim is to get " + mark
                + " number of territories(i.e. the specified %age) under your control in percent vicotry mmode.");
    }

    /*
     * void bonus(){ if(total<21){ bonus1=10-(ter1*total)/10;
     * bonus2=10-(ter2*total)/10; } else if(total>20&&total<51){
     * bonus1=8-(ter1*total)/20; bonus2=8-(ter2*total)/20; } else
     * if(total>50&&total<101){ bonus1=10-(ter1*total)/100;
     * bonus2=10-(ter2*total)/100; } else{ bonus1=20-(ter1*total)/100;
     * bonus2=20-(ter2*total)/100; } }
     */
    void dispScore() {
        System.out.println(p1 + " rolled dices totalling " + sum1);// +" inclusive of territory bonus: "+bonus1);
        System.out.println(p2 + " rolled dices totalling " + sum2);// +" inclusive of territory bonus: "+bonus2);
        System.out.println(p1 + " has territory spanning " + ter1 + " units.");
        System.out.println(p2 + " has territory spanning " + ter2 + " units.");
        if (!(getWinner().equals(""))) {
            System.out.println(getWinner() + " won");
            flag = 1;
        }
    }

    java.lang.String getWinner() {
        if (ter1 == mark)
            return p1;
        else if (ter2 == mark)
            return p2;
        else
            return "";
    }
}