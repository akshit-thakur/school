import java.util.InputMismatchException;
import java.util.Scanner;

class Matrix2016 {
    java.lang.String arr[][];
    int n;
    java.lang.String ch1, ch2, ch3;

    void initialize() {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter the size of square matrix: ");
            n = read.nextInt();
            if (n > 10) {
                System.out.println("Array size should be less than or equal to 10.Try again!");
                initialize();
            } else {
                System.out.println("Enter first character: ");
                ch1 = read.nextLine();
                System.out.println("Enter second character: ");
                ch2 = read.nextLine();
                System.out.println("Enter third character: ");
                ch3 = read.nextLine();
                arr = new java.lang.String[n][n];
                ch1 = "!";
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++)
                        arr[i][j] = ch2;
                }
            }
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Try again!");
            initialize();
        }
    }

    void fillDiagonals() {
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            arr[i][i] = ch3;
            arr[i][j] = ch3;
            j -= 1;
        }
    }

    void fillFirst() {
        int k = 1;
        for (int i = 0; i < (n / 2); i++) {
            for (int m = 1; m < n - 1; m++) {
                if (!(arr[i][m].equals(ch3))) {
                    arr[i][m] = ch1;
                    arr[n - k][m] = ch1;
                }
            }
            k += 1;
        }
    }

    void fillSecond() {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int m = 1; m < n / 2; m++) {
                if (!(arr[m][i].equals(ch3) || arr[m][i].equals(ch1))) {
                    arr[i][m] = ch2;
                    arr[n - k][m] = ch2;
                }
            }
            k += 1;
        }
    }

    void display() {
        System.out.println("The array of order " + n + " is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Matrix2016 obj = new Matrix2016();
        obj.initialize();
        obj.fillDiagonals();
        obj.fillFirst();
        // obj.fillSecond();
        obj.display();
    }
}
