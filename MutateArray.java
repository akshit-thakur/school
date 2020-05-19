import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MutateArray {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static int n;

    public static void main(String args[]) throws IOException {
        System.out.println("Enter the number of elements: ");
        n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers.");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(input.readLine());
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int choice;
        do {
            System.out.println("Enter 1 to delete element,2 to insert new element, 0 to exit.");
            choice = Integer.parseInt(input.readLine());
            switch (choice) {
            case 1:
                System.out.print("Enter the element to be deleted: ");
                int del = Integer.parseInt(input.readLine());
                removeElement(arr, del);
                break;
            case 2:
                System.out.print("Enter the element to be inserted: ");
                int add = Integer.parseInt(input.readLine());
                System.out.println("Enter the index number(Starting from 1)");
                int index = Integer.parseInt(input.readLine());
                insertElement(arr, add, index);
                break;
            default:
                ;
            }
        } while (choice != 0);
    }

    public static void removeElement(int[] arr, int x) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == x) {
                while (i < n - 1) {
                    arr[i] = arr[i + 1];
                    i++;
                }
            }
        }
        System.out.println("The new array is: ");
        for (int i = 0; i < n - 1; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void insertElement(int[] arr, int x, int index) {
        for (int i = n - 1; i >= 0; i--) {
            while (i > index - 1) {
                arr[i] = arr[i - 1];
                i--;
            }
        }
        arr[index - 1] = x;
        System.out.println("The new array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}