
//to find the sum of each row and column in a 2d matrix...seperately
import java.util.Scanner;
import java.io.IOException;

class RowColumnSum {
    public static void main(String args[]) throws IOException {
        Scanner read = new Scanner(System.in);
        int a[][] = new int[3][3];
        int sr1 = 0, sr2 = 0, sr3 = 0, sc1 = 0, sc2 = 0, sc3 = 0;
        System.out.println("Enter a 3*3 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                a[i][j] = read.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            int j = 0;
            sc1 += a[i][j];
            j = 1;
            sc2 += a[i][j];
            j = 2;
            sc3 += a[i][j];
        }
        for (int j = 0; j < 3; j++) {
            int i = 0;
            sr1 += a[i][j];
            i = 1;
            sr2 += a[i][j];
            i = 2;
            sr3 += a[i][j];
        }
        System.out.println("The Matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            if (i == 0)
                System.out.print("sum of row: " + sr1);
            else if (i == 1)
                System.out.print("sum of row: " + sr2);
            else if (i == 2)
                System.out.print("sum of row: " + sr3);
            System.out.println();
        }
        System.out.println(sc1 + " " + sc2 + " " + sc3);
        System.out.println("sum of columns");
        read.close();
    }
}
