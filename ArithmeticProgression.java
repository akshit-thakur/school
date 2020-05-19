import java.io.IOException;
import java.util.Scanner;

class ArithmeticProgression {
    public static void main(String args[]) throws IOException {
        Scanner read = new Scanner(System.in);
        System.out.println("1.To find nth term of AP.");
        System.out.println("2.To find sum of n terms of AP.");
        System.out.println("3. To find the last term.");
        System.out.println("4. To find the arithmetic mean.");
        System.out.println("Enter the corresponding number to make your choice.");
        int choice = read.nextInt();
        int a, b, d, n, l;
        double term, sum, result;
        switch (choice) {
        case 1:
            System.out.println("Enter the first term.");
            a = read.nextInt();
            System.out.println("Enter the common difference .");
            d = read.nextInt();
            System.out.println("Enter the value of n");
            n = read.nextInt();
            term = (a + ((n - 1)) * d);
            System.out.println("The " + n + "th term of AP is: " + term);
            break;
        case 2:
            System.out.println("Enter the value of l,if not given enter 0");
            l = read.nextInt();
            System.out.println("Enter the first term.");
            a = read.nextInt();
            System.out.println("Enter the common difference,if not given enter 0 .");
            d = read.nextInt();
            System.out.println("Enter the value of n");
            n = read.nextInt();
            if (l == 0) {
                sum = (n * ((2 * a) + (n - 1) * d)) / 2;
                System.out.println("The sum of series is :" + sum);
            } else if (d == 0) {
                sum = (n * (a + l)) / 2;
                System.out.println("The sum of series is :" + sum);
            }
            break;
        case 3:
            System.out.println("Enter the first term.");
            a = read.nextInt();
            System.out.println("Enter the common difference .");
            d = read.nextInt();
            System.out.println("Enter the value of n");
            n = read.nextInt();
            l = (a + ((n - 1) * d));
            System.out.println("The last term is :" + l);
            break;
        case 4:
            System.out.println("Enter the two terms.");
            a = read.nextInt();
            b = read.nextInt();
            result = (a + b) / 2;
            System.out.println("The A.M. is :" + result);
            break;
        default:
            System.out.println("Invalid input.");
        }
        read.close();
    }
}