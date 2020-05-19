import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MergeArray {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        /** array limits taken */
        System.out.println("Enter how many elements in array 1 you want: ");
        int n = Integer.parseInt(input.readLine());
        String arr[] = new String[n];
        System.out.println("Enter how many elements in array 2 you want: ");
        int m = Integer.parseInt(input.readLine());
        String arr2[] = new String[m];

        /** array limits taken */
        System.out.println("Enter " + n + " numbers for array 1:");
        for (int i = 0; i < n; i++)
            arr[i] = input.readLine();
        System.out.println("Enter " + m + " numbers for array 2:");
        for (int i = 0; i < m; i++)
            arr2[i] = input.readLine();

        /** Input taken from user for 2 arrays */
        System.out.println("First array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nSecond array: ");
        for (int i = 0; i < m; i++)
            System.out.print(arr2[i] + " ");

        /** The two arrays displayed */
        String[] resultArr = new String[m + n];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];
        for (int i = 0; i < m; i++)
            resultArr[i + n] = arr2[i]; // to avoid overlapping we start from i+n;

        /** insertion of elements of 2 arrays into a third array */
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (resultArr[i].equals(resultArr[j])) {
                    n -= 1;
                    for (int k = j; k < m + n; k++)
                        resultArr[k] = resultArr[k + 1];
                    j -= 1;
                }
            }
        }

        /** elimination of duplicate elements */
        System.out.println("\nMerged Array.");
        for (int k = 0; k < m + n; k++) {
            if (!(resultArr[k].equals(null)))
                System.out.print(resultArr[k] + " ");
        }
        System.out.println();
        /** final result */
    }
}
