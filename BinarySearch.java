
//class X prog.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BinarySearch {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[10];
        int s = 0, e = 9, m;
        boolean flag = true;
        System.out.print("Enter 10 numbers in sorted manner: ");
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(in.readLine());
        }
        System.out.println("The array is: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\nEnter the number to be searched.");
        int q = Integer.parseInt(in.readLine());
        while (s <= e) {
            m = (s + e) / 2;
            if (a[m] == q) {
                flag = true;
                System.out.println(q + " was found at " + (m + 1) + "th location");
                break;
            } else if (q > a[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        if (!flag) {
            System.out.println(q + " was not found.");
        }
    }
}
