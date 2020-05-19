
//class X program
import java.util.Scanner;

class LinearSearch {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            a[i] = in.nextInt();
        System.out.println("The array is: ");
        for (int j = 0; j < 10; j++)
            System.out.print(a[j] + " ");
        int query;
        boolean flag = false;
        System.out.print("\n\nEnter the number to be searched. ");
        query = in.nextInt();
        for (int i = 0; i < 10; i++) {
            if (a[i] == query) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(query + " has been found.");
        else
            System.out.println(query + " has not been found.");
        in.close();
    }
}
