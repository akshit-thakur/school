import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Matrix {
    public int arr[][];
    public int[][] arr2;
    public int[][] resultArr;
    int m, n;
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    Matrix(int mm, int nn) {
        m = mm;
        n = nn;
    }

    void fillArray() {
        arr = new int[m][n];
        arr2 = new int[m][n];
        resultArr = new int[m][n];
        try {
            System.out.println("Enter elements for matrix 1:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    arr[i][j] = Integer.parseInt(input.readLine());
            }
            System.out.println("Enter elements for matrix 2:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    arr2[i][j] = Integer.parseInt(input.readLine());
            }
        } catch (Exception e) {
            System.out.println("Error!Try Again");
            fillArray();
        }
    }

    void subtractArray() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                resultArr[i][j] = arr[i][j] - arr2[i][j];
        }
    }

    void display() {
        System.out.println("Matrix 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Enter the rows for matrix 1 and 2: ");
        int mm = Integer.parseInt(input.readLine());
        System.out.println("Enter the columns for matrix 1 and 2: ");
        int nn = Integer.parseInt(input.readLine());
        Matrix obj = new Matrix(mm, nn);
        obj.fillArray();
        obj.subtractArray();
        obj.display();
    }
}