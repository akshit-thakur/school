
/** min 1 stick max 4 sticks, the one to pick 21st stick is winner, can be single and multiplayer too!
   * errror in getMode(); and multiPlay(); doesn't stop Dated 23-02-15
   * Plans change. Only double player to be released for now. 21st stick picker isn't the winner,game continues after first end if 21 stick limit exceeds. Dated 07-04-2015
     */
import java.util.InputMismatchException;
import java.util.Scanner;

class TwentyOneSticks {
    static Scanner reader = new Scanner(System.in);
    java.lang.String p1, p2;
    int num, sticks, last;

    TwentyOneSticks() {
        p1 = "";
        p2 = "";
        num = 0;
        sticks = 0;
        last = 0;
    }

    public static void main(String args[]) {
        TwentyOneSticks obj = new TwentyOneSticks();
        obj.rules();
        System.out.println("Enter y if ready,any other letter to exit.");
        java.lang.String go = reader.nextLine();
        if (!(go.equalsIgnoreCase("y")))
            System.out.println("See you soon.");
        else
            obj.starter();
    }

    void starter() {
        System.out.println("Enter name,player 1: ");
        p1 = reader.nextLine();
        System.out.println("Enter name,player 2: ");
        p2 = reader.nextLine();
        multiPlay();
    }

    void rules() {
        System.out.println("Welcome to 21 Sticks.\nRules");
        System.out.println("Instructions for playing the game");
        System.out.println(
                "1. There will be 21 sticks, Player 1(in multiplay) and Player(in single play) has to start the game. ");
        System.out.println("2. The user can take maximum of four sticks and minimum of one stick at a time.");
        System.out.println("3. The player who takes the 21st stick will be the winner of the game.");
        System.out.println(
                "4. For every time the player/computer takes the number of sticks, it will be displayed on the screen.");
    }

    void multiPlay() {
        if (sticks < 21) {
            try {
                if (num % 2 == 0)
                    System.out.println("Enter the number of sticks you want to pick or press 0 to exit," + p1);
                else
                    System.out.println("Enter the number of sticks you want to pick or press 0 to exit," + p2);
                int n = reader.nextInt();
                if (n < 1 || n > 4) {
                    if (n == 0)
                        System.out.println("See you soon");
                    else {
                        System.out.println("Please enter a value between 1 and 4 only.");
                        multiPlay();
                    }
                } else {
                    if (sticks + n > 21) {
                        System.out.println("Limit of 21 sticks exceeded.");
                        multiPlay();
                    } else {
                        sticks += n;
                        if (sticks >= 20 && num % 2 == 0)
                            last = 1;
                        else if (sticks >= 20 && num % 2 != 0)
                            last = 2;
                        if (num % 2 == 0)
                            System.out.println(p1 + " picked " + n + " sticks ");
                        else
                            System.out.println(p2 + " picked " + n + " sticks ");
                        num++;
                    }
                    multiPlay();
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a value between 1 and 4");
                multiPlay();
            }
        } else {
            decideWin();
            sticks = 22;
        }
    }

    void decideWin() {
        if (last == 1)
            System.out.println(p1 + " won");
        else
            System.out.println(p2 + " won");
    }
    /*
     * void singlePlay(String p1,int sticks){ int comp=0,lastTurn=0; try{
     * System.out.println("Enter the number of sticks you want to pick,"+p1); int
     * n=Integer.parseInt(reader.nextLine()); if(n<1||n>4){
     * System.out.println("Please enter a value between 1 and 4 only.");
     * singlePlay(p1,sticks); } else{ sticks+=n; if(sticks==20) lastTurn=1;
     * System.out.println(p1+" picked "+n+" sticks "); if(sticks<10){ if(n==1)
     * comp=4; else if(n==2) comp=3; else if(n==3) comp=2; else if(n==4) comp=1; }
     * else{ if(n==1) comp=4; else if(n==2) comp=3; else if(n==3) comp=2; else
     * if(n==4) comp=1; } System.out.println("Computer picked "+comp+" sticks.");
     * sticks+=comp; if(sticks==20) lastTurn=2; } if(lastTurn==2)
     * System.out.println(p1+" won the game "); else if(lastTurn==1)
     * System.out.println("Computer won the game "); else singlePlay(p1,sticks); }
     * catch(Exception e){
     * System.out.println("Please enter a value between 1 and 4");
     * singlePlay(p1,sticks); } }
     */
}