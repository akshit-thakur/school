import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FactorialRec {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a no.");
        int num = Integer.parseInt(input.readLine());
        FactorialRec obj = new FactorialRec();
        long factorial = (long) obj.findFact(num);
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    int findFact(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * findFact(n - 1);
    }
}