import java.util.Scanner;

class MiddleNum {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        int middle = 0;
        if (a != max && a != min)
            middle = a;
        else if (b != max && b != min)
            middle = b;
        else
            middle = c;
        System.out.println("The middle number is: " + middle);
        read.close();
    }
}