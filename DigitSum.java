import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DigitSum {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num = Integer.parseInt(input.readLine());
        int sum = 0, digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}
