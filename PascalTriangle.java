import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PascalTriangle {
    public static void main(String args[]) throws IOException {
        PascalTriangle obj = new PascalTriangle();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows.");
        int row = Integer.parseInt(input.readLine());
        for (int n = 1; n <= row; n++) {
            for (int k = row - n; k > 0; k--) {
                System.out.print("  ");
            }
            for (int r = 0; r <= n; r++) {
                int p = obj.getFact(n);
                int q = obj.getFact(r);
                int s = obj.getFact(n - r);
                System.out.print(p / (q * s));
                for (int j = row - 1; j > 1; j--)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    int getFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
}