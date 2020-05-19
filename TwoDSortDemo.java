import java.util.InputMismatchException;
import java.util.Scanner;

class TwoDSortDemo {
    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            SelectionSortPkg obj = new SelectionSortPkg();
            ArrayDisplay obj1 = new ArrayDisplay();
            int m = 3, n = 3;
            int[][] a = new int[m][n];
            char[][] a1 = new char[m][n];
            System.out.println("Enter 9 numbers.");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    a[i][j] = read.nextInt();
            }
            System.out.println("Enter 9 characters.");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    a1[i][j] = read.next().charAt(0);
            }
            System.out.println("The int array: ");
            obj1.display(a, m, n);
            System.out.println("The char array: ");
            obj1.display(a1, m, n);
            obj.selSort(a, m, n, 0);
            obj.selSort(a1, m, n, 0);
            System.out.println("The sorted 2D int array: ");
            obj1.display(a, m, n);
            System.out.println("The sorted 2D char array: ");
            obj1.display(a1, m, n);
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Error");
        }
    }
}