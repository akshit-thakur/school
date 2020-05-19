import java.util.Scanner;

class FibonacciSeries {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter how many terms");
        int n = read.nextInt();
        System.out.println("The Fibonacci Series for first " + n + " terms is :");
        int x = 1, y = 1, i = 1;
        System.out.print(x + "," + y); // first 2 terms
        // rest n-2 terms
        while (i <= n - 2) {
            int z = x + y;
            System.out.print("," + z);
            x = y;
            y = z;
            i++;
        }
        read.close();
    }
}