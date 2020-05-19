import java.util.Scanner;

class GeometricProgression {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("1.To find nth term of GP.");
        System.out.println("2.To find sum of n terms of GP.");
        System.out.println("3. To find sum of infinite terms of GP.");
        System.out.println("4. To find the geometric mean.");
        System.out.println("Enter the corresponding number to make your choice.");
        int choice = read.nextInt();
        int a, b, n;
        double term, sum, result;
        double r;
        switch (choice) {
        case 1:
            System.out.println("Enter the first term.");
            a = read.nextInt();
            System.out.println("Enter the common ratio in decimals.");
            r = read.nextFloat();
            System.out.println("Enter the value of n");
            n = read.nextInt();
            term = a * (Math.pow(r, (n - 1)));
            System.out.println("The " + n + "th term of GP is: " + term);
            break;
        case 2:
            System.out.println("Enter the first term.");
            a = read.nextInt();
            System.out.println("Enter the common ratio in decimals.");
            r = read.nextFloat();
            System.out.println("Enter the value of n");
            n = read.nextInt();
            if (r > 1) {
                sum = (a * (Math.pow(r, n) - 1)) / (r - 1);
            } else {
                sum = (a * (1 - (Math.pow(r, n)))) / (1 - r);
            }
            System.out.println("The sum of series is :" + sum);
            break;
        case 3:
            System.out.println("Enter the first term.");
            a = read.nextInt();
            System.out.println("Enter the common ratio in decimals.");
            r = read.nextFloat();
            if (r < 1) {
                sum = (a / (1 - r));
                System.out.println("The sum of the infinte terms is :" + sum);
            } else {
                System.out.println("Error! r can't be greater than 1");
            }

            break;
        case 4:
            System.out.println("Enter the two terms.");
            a = read.nextInt();
            b = read.nextInt();
            result = Math.sqrt(a * b);
            System.out.println("The G.M. is :" + result);
            break;
        default:
            System.out.println("Invalid input.");
        }
        read.close();
    }
}
