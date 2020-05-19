
//class X prog

import java.util.Scanner;

class BubbleSort {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            a[i] = in.nextInt();
        System.out.println("The array is: ");
        for (int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Array.");
        for (int k = 0; k < 10; k++)
            System.out.print(a[k] + " ");
        in.close();
    }
}