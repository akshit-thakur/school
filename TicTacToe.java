
/**
   *v1.0 (bug found:- Drawn game continues. Fixed 02-04-2015)
    started 30-3-15
    Get better game win conditions. Dated 31-3-15
    Finished 01-04-2015
   * v1.0.1 
     update will be loop and the count of games won
     done 02-04-2015
   * v1.0.2
     exception handling improved. Game crashes because otherwise also the game crashes!
     done 5-4-15
   * v1.0.3
     No game crash! starter() included.
     done 6-4-15
   *v1.1 improvements should be AI
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TicTacToe {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static TicTacToe obj = new TicTacToe();
    private java.lang.String arr[][] = new java.lang.String[3][3];

    void dispRef() {
        int arr[][] = new int[3][3];
        int n = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = n;
                n++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.println("\t\t\t" + arr[i][0] + " | " + arr[i][1] + " | " + arr[i][2]);
                System.out.println("\t\t\t----------");
            } else
                System.out.println("\t\t\t" + arr[i][0] + " | " + arr[i][1] + " | " + arr[i][2]);
        }
    }

    void dispGame() {
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.println("\t\t\t" + arr[i][0] + " | " + arr[i][1] + " | " + arr[i][2]);
                System.out.println("\t\t\t----------");
            } else
                System.out.println("\t\t\t" + arr[i][0] + " | " + arr[i][1] + " | " + arr[i][2]);
        }
    }

    boolean isEmpty(int location) {
        if (location != -1)
            return arr[location / 10][location % 10].equals(" ");
        else
            return false;
    }

    boolean isDraw() {
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(" "))
                    flag = 1;
            }
        }
        return flag == 0;
    }

    java.lang.String checkWin(java.lang.String input, java.lang.String p1, java.lang.String p2) {
        int flag = 0;
        if (arr[0][0].equals(arr[1][0]) && arr[1][0].equals(arr[2][0]) && arr[2][0].equals(input))
            flag = 1;
        else if (arr[0][1].equals(arr[1][1]) && arr[1][1].equals(arr[2][1]) && arr[2][1].equals(input))
            flag = 1;
        else if (arr[0][2].equals(arr[1][2]) && arr[1][2].equals(arr[2][2]) && arr[2][2].equals(input))
            flag = 1;
        else if (arr[0][0].equals(arr[1][0]) && arr[0][1].equals(arr[0][2]) && arr[0][2].equals(input))
            flag = 1;
        else if (arr[1][0].equals(arr[1][1]) && arr[1][1].equals(arr[1][2]) && arr[1][2].equals(input))
            flag = 1;
        else if (arr[2][0].equals(arr[2][1]) && arr[2][1].equals(arr[2][2]) && arr[2][2].equals(input))
            flag = 1;
        else if (arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2]) && arr[2][2].equals(input))
            flag = 1;
        else if (arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0]) && arr[2][0].equals(input))
            flag = 1;
        if (flag == 1) {
            if (input.equals("X"))
                return p1;
            else
                return p2;
        }
        return " ";
    }

    void emptyBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                arr[i][j] = " ";
        }
    }

    void dispScore(java.lang.String p1, java.lang.String p2, int score1, int score2) {
        System.out.println("Out of the non-tied games the results are: ");
        System.out.println(p1 + " won " + score1 + " games.");
        System.out.println(p2 + " won " + score2 + " games.");
    }

    void getInput(int n, java.lang.String p1, java.lang.String p2, int score1, int score2, int count, int games) {
        try {
            int location = -1;
            java.lang.String winner = " ";
            if (isDraw()) {
                System.out.println("The game is drawn.");
                count++;
                if (count != games) {
                    System.out.println("Next Game.");
                    n++;
                    emptyBoard();
                    getInput(n, p1, p2, score1, score2, count, games);
                }
            } else {
                if (n % 2 != 0)
                    System.out.println("Your turn, " + p1 + ". Where to put the X? Enter 0 to exit");
                else
                    System.out.println("Your turn, " + p2 + ". Where to put the O? Enter 0 to exit");
                int choice = Integer.parseInt(input.readLine());
                if (choice == 0)
                    System.out.println("See you soon.");
                else {
                    java.lang.String input; // whether X or O
                    if (n % 2 != 0)
                        input = "X";
                    else
                        input = "O";
                    switch (choice) {
                    case 1:
                        location = 00;
                        break;
                    case 2:
                        location = 01;
                        break;
                    case 3:
                        location = 02;
                        break;
                    case 4:
                        location = 10;
                        break;
                    case 5:
                        location = 11;
                        break;
                    case 6:
                        location = 12;
                        break;
                    case 7:
                        location = 20;
                        break;
                    case 8:
                        location = 21;
                        break;
                    case 9:
                        location = 22;
                        break;
                    default:
                        System.out.println("Invalid Input.");
                        getInput(n, p1, p2, score1, score2, count, games);
                    }
                    if (isEmpty(location)) {
                        arr[location / 10][location % 10] = input;
                        dispGame();
                        winner = checkWin(input, p1, p2);
                        if (winner.equals(" ")) {
                            n++;
                            getInput(n, p1, p2, score1, score2, count, games);
                        } else {
                            System.out.println(winner + " won this game");
                            if (winner.equals(p1))
                                score1++;
                            else
                                score2++;
                            count++;
                            if (count != games) {
                                System.out.println("Next Game.");
                                emptyBoard();
                                getInput(n, p1, p2, score1, score2, count, games);
                            } else
                                dispScore(p1, p2, score1, score2);
                        }
                    } else {
                        System.out.println("That box is already taken.");
                        getInput(n, p1, p2, score1, score2, count, games);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Input,try again.");
            getInput(n, p1, p2, score1, score2, count, games);
        }
    }

    void starter() {
        int flag = 0, games;
        java.lang.String p1, p2;
        try {
            System.out.print("Enter name,Player 1: ");
            p1 = input.readLine();
            System.out.print("Enter name,Player 2: ");
            p2 = input.readLine();
            System.out.print("How many games do you want to play? ");
            games = Integer.parseInt(input.readLine());
            if (games == 0) {
                System.out.println("Games can't be zero.\nHow many games?");
                games = Integer.parseInt(input.readLine());
                if (games == 0)
                    flag = 1;
            }
            System.out.println("Welcome to the game of TicTacToe.");
            obj.dispRef();
            System.out.println("Memorise the box numbers,I'll ask you the box number where you want the X/O");
            obj.emptyBoard();
            if (flag != 1)
                obj.getInput(1, p1, p2, 0, 0, 0, games);
            else {
                System.out.println("Default 3-round Game Started!");
                obj.getInput(1, "Player 1", "Player 2", 0, 0, 0, 3);
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
            starter();
        }
    }

    public static void main(String args[]) {
        obj.starter();
    }
}