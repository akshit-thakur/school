import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrimeRec {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(input.readLine());
        PrimeRec obj = new PrimeRec();
        int check = obj.prime(n, 1);
        if (check == 2)
            System.out.println(n + " is prime.");
        else
            System.out.println(n + " is not prime.");
    }

    int c = 0;

    int prime(int n, int y) {
        if (y <= n) {
            if (n % y == 0) {
                c++;
            }
            return prime(n, y + 1);
        } else
            return c;
    }
}