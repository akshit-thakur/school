import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PowerRec {
    public static void main(String args[]) throws IOException {
        PowerRec obj = new PowerRec();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the base: ");
        long m = Long.parseLong(input.readLine());
        System.out.println("Enter the power: ");
        long n = Long.parseLong(input.readLine());
        long result = obj.power(m, n);
        System.out.println(m + "^" + n + "=" + result);
    }

    long power(long x, long y) {
        if (y == 1)
            return x;
        else
            return x * (power(x, y - 1));
    }
}