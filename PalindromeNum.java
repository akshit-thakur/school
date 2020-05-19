import java.util.Scanner;

class PalindromeNum {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = read.nextInt();
        read.close();
        checkPalin(num);
    }

    public static void checkPalin(int n) {
        int d, r = 0, x = n;
        while (n > 0) {
            d = n % 10;
            r = (r * 10) + d;
            n /= 10;
        }
        if (r == x) {
            System.out.println(x + " is a palindrome");
        } else {
            System.out.println(x + " is not a palindrome");
        }
    }
}