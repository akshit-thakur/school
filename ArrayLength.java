import java.io.IOException;
import java.util.Scanner;

class ArrayLength {
    public static void main(String args[]) throws IOException {
        Scanner read = new Scanner(System.in);
        java.lang.String a[] = new java.lang.String[100000];
        for (int i = 0; i < 100000; i++) {
            System.out.println("Enter a string. To exit the loop, enter exit.");
            a[i] = read.nextLine();
            if ( a[i].equalsIgnoreCase("exit"))
                break;
        }
        int ctr = 0;
        for (int i = 0; i < 100000; i++) {
            if (a[i].equals("exit") || a[i] == null) {
                System.out.println();
                break;
            } else {
                ctr++;
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("The length of array is: " + ctr);
        read.close();
    }
}