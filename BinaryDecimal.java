import java.util.InputMismatchException;
import java.util.Scanner;

class BinaryDecimal {
    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter a binary number.");
            java.lang.String binary = read.nextLine();
            int p = 0, dec = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                // p(power) increses from right to left,so i=binary.length()-1
                if (binary.charAt(i) == '0')
                    p++;
                else if (binary.charAt(i) == '1') {
                    dec += Math.pow(2, p);
                    p++;
                }
            }
            System.out.println("The decimal of binary " + binary + " is : " + dec);
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Error in input");
        }
    }
}