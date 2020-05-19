/**Recursive Technique programs
 * 1. powerRec(int,int) //return m^n recursively
 * 2. fibonacciRec(int) //returns fibonacci series to n terms
 * 3. primeRec(int,int,ctr) //ctr=0 on first pass;if(ctr==2),number is prime.
 * 4. primeFactorRec(int,q) //q=2 on first pass
 * 5. stringRevRec(String,int) //reveses the string recursively
 * 6. binaryRec(int) //returns the 
 */
class Recursion {
    int powerRec(int m, int n) {
        return (n == 1) ? m : m * powerRec(m, n - 1);
    }

    int fibonacciRec(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else if (n > 2)
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        else
            return -1;
    }

    int primeRec(int num, int q, int ctr) {
        if (q <= num) {
            if (num % q == 0)
                ctr++;
            return primeRec(num, q + 1, ctr);
        } else
            return ctr;
    }

    void primeFactorRec(int num, int q) {
        if (num > 1) {
            if (num % q == 0)
                System.out.print(q + ",");
            primeFactorRec(num / q, q);
        } else
            primeFactorRec(num, q + 1);
    }

    void stringRevRec(java.lang.String str, int len) {
        if (len < str.length()) {
            char ch = str.charAt(len);
            stringRevRec(str, len + 1);
            System.out.print(ch);
        }
    }

    void binaryRec(int num) {
        if (num > 0) {
            int d = num % 2;
            binaryRec(num / 2);
            System.out.print(d);
        }
    }

    int factorialRec(int n) {
        return (n < 2) ? 1 : n * factorialRec(n - 1);
    }

    int gcdRec(int p, int q) {
        return (q == 0) ? p : gcdRec(q, p % q);
    }

    void selectionSortRec(int arr[], int size, int limit) { // size is always 0 on first pass
        if (size >= limit - 1)
            return;
        int pos = size;
        for (int j = size + 1; j < limit; j++) {
            if (arr[j] < arr[pos])
                pos = j;
        }
        int temp = arr[size];
        arr[size] = arr[pos];
        arr[pos] = temp;
        selectionSortRec(arr, size, limit);
    }
}