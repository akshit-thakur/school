
/** Lost my previous Chess program in a windows re-install :(
 * Restarting my chess project Dated 20/12/2014
 * Target/Current variables to be done(done) 20/12 :)
 * DO move checks for all and other stuff Dt. 20/3/15
 * Pawn move check wrong dt 02-04-15.
 * Rook Move check wrong dt 31/3/15.
 * replace r with currentR if left
*/
import java.util.InputMismatchException;
import java.util.Scanner;

class Chess {
    java.lang.String board[][] = new java.lang.String[8][8];
    int n, current, target, currentC, targetC, targetR, currentR;
    java.lang.String piece;

    Chess() {
        n = 0;
        current = 0;
        target = 0;
        targetR = 0;
        currentR = 0;
        currentC = 0;
        targetC = 0;
        piece = "";
    }

    void rules() {
        System.out.println("Welcome to the game of chess! The Rules are: ");
        System.out.println("Capital Letters is Player 1.Small letters is Player 2.");
        System.out.println("First,enter the letter of the piece you want to move(e.g. p for pawn)");
        System.out.println("Then,enter current location in row-column format.");
        System.out.println("Then,enter target location in same format as above.DON'T ENTER LOCATIONS IN LETTERS.");
    }

    void fillBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                board[i][j] = " ";
        }
        for (int i = 0; i < 8; i++) {
            board[6][i] = "P";
            board[1][i] = "p";
        }
        board[0][0] = "r";
        board[0][7] = "r";
        board[7][0] = "R";
        board[7][7] = "R";
        board[0][1] = "h";
        board[0][6] = "h";
        board[7][1] = "H";
        board[7][6] = "H";
        board[0][2] = "b";
        board[0][5] = "b";
        board[7][2] = "B";
        board[7][5] = "B";
        board[0][3] = "k";
        board[0][4] = "q";
        board[7][3] = "K";
        board[7][4] = "Q";
    }

    void dispBoard() {
        System.out.print("\t\t\t   ");
        for (int i = 1; i <= 8; i++)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print("\t\t\t " + (i + 1) + " ");
            for (int j = 0; j < 8; j++)
                System.out.print(board[i][j] + " ");
            System.out.println((i + 1) + " ");
        }
        System.out.print("\t\t\t   ");
        for (int i = 1; i <= 8; i++)
            System.out.print(i + " ");
        System.out.println();
    }

    boolean pieceNotFound(java.lang.String str) {
        System.out.println(currentR + "," + currentC + ":" + targetR + "," + targetC + "," + board[currentR][currentC]
                + "," + board[targetR][targetC] + "," + str);
        return (board[currentR][currentC].equals(str)) ? false : true;
        // return board[currentR][currentC].equals(str);
    }

    boolean moveValid() {
        if (piece.equalsIgnoreCase("p"))
            return pawn();
        else if (piece.equalsIgnoreCase("r"))
            return rook();
        /**
         * else if(piece.equalsIgnoreCase("k")) return king(r,currentC,targetR,targetC);
         * else if(piece.equalsIgnoreCase("q")) return
         * queen(r,currentC,targetR,targetC); else if(piece.equalsIgnoreCase("h"))
         * return knight(r,currentC,targetR,targetC); else
         * if(piece.equalsIgnoreCase("b")) return bishop(r,currentC,targetR,targetC);
         */
        else
            return false;
    }

    boolean pawn() {
        if (n % 2 == 0) {
            if (currentR == 6) {
                if (currentR != targetR - 2 || currentR != targetR - 1)
                    return false;
            } else {
                if (currentR != targetR - 1)
                    return false;
                else if (!(board[targetR][targetC].equals(" "))) {
                    if ((currentC != targetC)) {
                        if (currentC == targetC + 1 || currentC == targetC - 1)
                            return true;
                        else
                            return false;
                    }
                } else
                    return true;
            }
        } else {
            if (currentR == 1) {
                if (currentR != targetR + 2 || currentR != targetR + 1)
                    return false;
            } else {
                if (currentR != targetR + 1)
                    return false;
                else if (!(board[targetR][targetC].equals(" "))) {
                    if ((currentC != targetC)) {
                        if (currentC == targetC + 1 || currentC == targetC - 1)
                            return true;
                        else
                            return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    boolean rook() {
        if (targetR != currentR)
            return false;
        else if (!(board[targetR][targetC].equals(" "))) {
            if (currentC < targetC) {
                for (int j = currentC; j <= targetC; j++) {
                    if (board[currentR][j].equals(" "))
                        return true;
                }
                return false;
            } else if (currentC > targetC) {
                for (int j = currentC; j >= targetC; j--) {
                    if (board[currentR][j].equals(" "))
                        return true;
                }
                return false;
            }
        }
        return true;
    }

    void getInput() {
        Scanner read = new Scanner(System.in);
        try {
            if ((n % 2) == 0)
                System.out.println("Player 1,Enter your desired piece.e.g. P for pawn.Type any number to quit.");
            else
                System.out.println("Player 2,Enter your desired piece.e.g. p for pawn.Type any number to quit.");
            java.lang.String piece = read.nextLine();
            if (Character.isDigit(piece.charAt(0)))
                System.out.println("See you soon");
            else {
                System.out.println("Enter current location as 12 for row 1 column 2");
                current = read.nextInt();
                System.out.println("Enter target location as 22 for row 2 column 2");
                target = read.nextInt();
                currentR = (current / 10) - 1;
                currentC = (current % 10) - 1;
                targetR = (target / 10) - 1;
                targetC = (target % 10) - 1;
                if (pieceNotFound(piece)) {
                    System.out.println("Piece not found.Try again!");
                    getInput();
                } else {
                    if (moveValid()) {
                        board[targetR][targetC] = piece;
                        board[currentR][currentC] = " ";
                        dispBoard();
                        n++;
                        getInput();
                    } else {
                        System.out.println("Invalid Move. Try again!");
                        getInput();
                    }
                }
            }
            read.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location.Try again!");
            getInput();
        } catch (InputMismatchException e1) {
            System.out.println("Invalid Input. Try again!");
            getInput();
        }
    }

    public static void main(String args[]) {
        Chess obj = new Chess();
        obj.rules();
        obj.fillBoard();
        obj.dispBoard();
        obj.getInput();
    }
}