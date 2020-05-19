import java.util.InputMismatchException;
import java.util.Scanner;

class DecimalOctal {
    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter a decimal.");
            int n = read.nextInt();
            java.lang.String octal = "";
            System.out.println("The octal of " + n + " is: ");
            while (n > 0) {
                switch (n % 8) {
                case 0:
                    octal = octal.concat("0");
                    break;
                case 1:
                    octal = octal.concat("1");
                    break;
                case 2:
                    octal = octal.concat("2");
                    break;
                case 3:
                    octal = octal.concat("3");
                    break;
                case 4:
                    octal = octal.concat("4");
                    break;
                case 5:
                    octal = octal.concat("5");
                    break;
                case 6:
                    octal = octal.concat("6");
                    break;
                case 7:
                    octal = octal.concat("7");
                    break;
                }
                n /= 8;
            }
            StringBuffer rev = new StringBuffer(octal);
            // because octal is stored in reverse order,we reverse the
            // string using stringBuffer
            octal = (rev.reverse()).toString();
            System.out.println(octal);
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Error in input");
        }
    }
}