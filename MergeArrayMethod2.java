import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MergeArray1 {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        /** array limits taken */
        System.out.println("Enter how many elements in array 1 you want: ");
        int n = Integer.parseInt(input.readLine());
        java.lang.String arr[] = new java.lang.String[n];
        System.out.println("Enter how many elements in array 2 you want: ");
        int m = Integer.parseInt(input.readLine());
        java.lang.String arr2[] = new java.lang.String[m];

        /** Input taken from user for 2 arrays */
        System.out.println("Enter " + n + " numbers for array 1:");
        for (int i = 0; i < n; i++)
            arr[i] = input.readLine();
        System.out.println("Enter " + m + " numbers for array 2:");
        for (int i = 0; i < m; i++)
            arr2[i] = input.readLine();

        /** The two arrays displayed */
        System.out.println("First array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nSecond array: ");
        for (int i = 0; i < m; i++)
            System.out.print(arr2[i] + " ");

        /** insertion of elements of 2 arrays into a third array */
        int[] resultArr = new int[m + n];
        for (int i = 0; i < n; i++)
            resultArr[i] = Integer.parseInt(arr[i]);
        for (int i = 0; i < m; i++)
            resultArr[i + n] = Integer.parseInt(arr2[i]); // to avoid overlapping we start from i+n;

        /** elimination of duplicate elements */
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (resultArr[i] == (resultArr[j])) {
                    n -= 1;
                    for (int k = j; k < m + n; k++)
                        resultArr[k] = resultArr[k + 1];
                    j -= 1;
                }
            }
        }

        /** bubble sort */
        int ctr = 0;
        for (int i = 0; i < (m + n); i++) {
            for (int j = 0; j < ((m + n) - i - 1); j++) {
                if (resultArr[j] > resultArr[j + 1]) {
                    int temp = resultArr[j];
                    resultArr[j] = resultArr[j + 1];
                    resultArr[j + 1] = temp;
                }
            }
            ctr++;
        }

        /** final result */
        System.out.println("\nMerged Array.");
        for (int k = 0; k < ctr; k++) {
            System.out.print(resultArr[k] + " ");
        }
        System.out.println();
    }
}
