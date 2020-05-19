import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PseudoArithmetic {
    int n; /* stores the size of sequence */
    int[] a; /* stores the sequence in an array */
    boolean flag; /* stores the status */
    int sum; /* stores the sum of seuquence of numbers */
    int r; /* stores the sum of two numbers */
    boolean ans; /* stores the status */

    /** default constructor */
    PseudoArithmetic() {
        n = 0;
        flag = false;
        sum = 0;
        r = 0;
        ans = false;
    }

    /** assigns value to array */
    void accept(int nn) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        n = nn;
        a = new int[n]; /** Array initialized here */
        System.out.println("Enter " + n + " elements.");
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(input.readLine());
    }

    /** Checks for PseudoArithmetic */
    boolean check() {
        int temp = n;
        /** temp variable to store size */
        for (int i = 0; i < temp; i++) {
            r = a[i] + a[temp - 1];
            temp--;
            sum += r;
        }
        if (n % 2 != 0)
            flag = true;
        if (flag == true) {
            if (sum == ((n / 2) + 1)
                    * (2 * a[(n / 2)])) /** odd size *//*
                                                        * [No. of pairs=(No. of elements)/2].In case of odd,we have the
                                                        * 1 extra pair i.e. middle term.
                                                        */
                ans = true;
        } else {
            if (sum == (n / 2) * (a[(n / 2)] + a[(n / 2) - 1])) /* No. of pairs=(No. of elements)/2 */ /** even size */
                ans = true;
        }
        return ans;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of sequence: ");
        int nn = Integer.parseInt(input.readLine());
        PseudoArithmetic obj = new PseudoArithmetic();
        obj.accept(nn);
        if (obj.check()) /** returns true */
            System.out.println("The series is psuedo arithmetic having sum equal to: " + obj.sum);
        else
            System.out.println("The series is not psuedo arithmetic.");
    }
}