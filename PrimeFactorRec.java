import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrimeFactorRec {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number.");
        int num = Integer.parseInt(input.readLine());
        PrimeFactorRec obj = new PrimeFactorRec();
        System.out.println("The prime factors of " + num + " are: ");
        obj.primeFactors(num, 2);
    }

    void primeFactors(int num, int q) {
        if (num > 1) {
            if (num % q == 0) {
                System.out.print(q + " ");
                primeFactors(num / q, q);
            } else
                primeFactors(num, q + 1);
        }
    }
}
