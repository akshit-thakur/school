import java.io.*;

class HollowDiamond {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of rows: ");
        int n = Integer.parseInt(input.readLine());
        for (int i = 0; i < (n / 2); i++) {
            if (i == 0) {
                for (int k = 0; k <= (n / 2) - 1; k++) {
                    if (k == (n / 2) - 1)
                        System.out.print("*");
                    else
                        System.out.print("**");
                }
            } else {
                for (int k = 1; k <= (n / 2) - i; k++)
                    System.out.print("*");
                for (int j = 1; j < i; j++)
                    System.out.print(" ");
                for (int j = i; j >= 1; j--)
                    System.out.print(" ");
                for (int k = (n / 2) - i; k >= 1; k--)
                    System.out.print("*");
            }
            System.out.println();
        }
        // upper ends
        for (int i = (n / 2); i > 0; i--) {
            if (i == 0) {
                for (int k = i; k <= (n / 2) - 1; k++) {
                    if (k == (n / 2) - 1)
                        System.out.print("*");
                    else
                        System.out.print("**");
                }
            } else {
                for (int k = 1; k <= (n / 2) - i; k++)
                    System.out.print("*");
                for (int j = 1; j < i; j++)
                    System.out.print(" ");
                for (int j = i; j >= 1; j--)
                    System.out.print(" ");
                for (int k = (n / 2) - i; k >= 1; k--)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}