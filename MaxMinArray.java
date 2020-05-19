
/** Class Name: MaxMinArray
 * Instance variables: 
 * int[] arr
 * int len(length of array)
 * int max(maximum number)
 * int min(minimum number)
 * Member Methods:
 * void initialiseArr() //initialise the array.
 * void selectionSort(); //does selection sort on the array.
 * void getMin(); //intialises min.
 * void getMax(); //intitalises max.
 * void display(); //displays the max and min elements.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaxMinArray {
    int[] arr;
    int len, max, min;

    MaxMinArray(int x) {
        len = x;
        arr = new int[len];
        max = 0;
        min = 0;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of array: ");
        int n = Integer.parseInt(input.readLine());
        MaxMinArray obj = new MaxMinArray(n);
        obj.initialiseArr();
        obj.selectionSort();
        obj.getMin();
        obj.getMax();
        obj.display();
    }

    void initialiseArr() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; i++)
            arr[i] = Integer.parseInt(input.readLine());
        System.out.println("The array is: ");
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void selectionSort() {
        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void getMin() {
        min = arr[0];
    }

    void getMax() {
        max = arr[len - 1];
    }

    void display() {
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}