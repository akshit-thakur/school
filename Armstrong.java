
//class 10 prog. Modified on 29/7/19 to make more VS Code friendly
import java.io.IOException;
import java.util.Scanner;

class Armstrong {
    private int num = 153;

    public static void main(String args[]) throws IOException {
        Armstrong obj = new Armstrong();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an armstrong number or not");
        int n = read.nextInt();
        obj.armstrong(n);
        read.close();
    }

    void armstrong(int n) {
        int d = 0, s = 0, temp = n;
        while (n > 0) {
            d = n % 10; // to extract the last digit of the number
            s += (int) Math.pow(d, 3); // adds the cube of the last digit to sum of the previous loop
            n /= 10; // update statement to give up the last digit and keep the rest of them
        }
        if (temp == s)
            System.out.println("The number " + num + " is armstrong num.");
        else
            System.out.println("The number " + num + " is not armstrong num.");
    }
}
// 9th May,2013