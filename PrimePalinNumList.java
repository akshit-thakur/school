public class PrimePalinNumList {
    public static void main(String args[]) {
        System.out.println("The prime number whose palindrome is also prime are:");
        for (int n = 11; n <= 1000; n++) {
            int flag = 0;
            for (int x = 2; x < n; x++) {
                if (n % x == 0)
                    flag = 1;
            }
            if (flag == 0) {
                int d, r = 0, i = n;
                while (n > 0) {
                    d = n % 10;
                    r = (r * 10) + d;
                    n /= 10;
                }
                if (i == r)
                    System.out.print(n + " ");
            }
        }
    }
}