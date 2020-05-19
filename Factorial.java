import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Factorial {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n = Integer.parseInt(input.readLine());
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("The factorial is :" + fact);
    }
}
