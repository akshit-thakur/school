
//class X prog
import java.io.IOException;
import java.util.Scanner;

class SelectionSort {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int temp = 0, min = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            a[i] = in.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            min = j;
            for (int k = j + 1; k < 10; k++) {
                if (a[k] < a[min])
                    min = k;
            }
            temp = a[min];
            a[min] = a[j];
            a[j] = temp;
        }
        System.out.println("The Sorted Array is: ");
        for (int l = 0; l < 10; l++)
            System.out.print(a[l] + " ");
        in.close();
    }
}