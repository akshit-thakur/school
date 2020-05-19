import java.util.Scanner;

class Exponents {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the base.");
        int b = read.nextInt();
        System.out.println("Enter the power.");
        int p = read.nextInt();
        double exponent = Math.pow(b, p);
        System.out.println(b + "^" + p + " is " + exponent);
        read.close();
    }
}