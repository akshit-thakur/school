import java.util.Scanner;

class Factors {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = read.nextInt();
        System.out.println("The factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0)
                System.out.print(i + " ");
        }
        read.close();
    }
}
