import java.util.InputMismatchException;
import java.util.Scanner;

class DecimalBinary {
    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter a decimal.");
            int n = read.nextInt();
            java.lang.String binary = ""; /** holds the series of 0,1 in binary form */
            System.out.println("The binary of " + n + " is: ");
            while (n > 0) {
                /** while the dec doesn't become zero */
                switch (n % 2) {
                case 0:
                    binary = binary.concat("0");
                    break;
                case 1:
                    binary = binary.concat("1");
                    break;
                }
                n /= 2;
            }
            StringBuffer rev = new StringBuffer(binary);
            // because binary is stored in reverse order,we reverse the string using
            // stringBuffer
            binary = (rev.reverse()).toString();
            System.out.println(binary);
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Error in input");
        }
    }
}