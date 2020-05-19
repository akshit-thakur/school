import java.util.InputMismatchException;
import java.util.Scanner;

class MagicSquare {
    int[][] square; // stores magic square
    int n; // stores the order

    MagicSquare(int x) {
        square = new int[x][x];
        n = x;
    }

    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter an odd number");
            int temp = read.nextInt();
            if (temp % 2 == 0)
                System.out.println("Please enter an ODD number.Cannot continue");
            else {
                MagicSquare obj = new MagicSquare(temp);
                obj.create();
                obj.display();
            }
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Error in input.");
        }
    }

    void create() {
        int r = n - 1, c = n / 2;
        square[r][c] = 1;
        for (int i = 2; i <= (n * n); i++) {
            if (square[(r + 1) % n][(c + 1) % n] == 0) {
                r = (r + 1) % n;
                c = (c + 1) % n;
            } else
                r = (r - 1 + n) % n; // don't change column
            square[r][c] = i;
        }
    }

    void display() {
        System.out.println("Magic square of order " + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] < 10)
                    System.out.print(" "); // for alignment
                if (square[i][j] < 100)
                    System.out.print(" ");// for alignment
                System.out.print(square[i][j]);
            }
            System.out.println();
        }
    }
}