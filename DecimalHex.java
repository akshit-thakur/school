import java.util.InputMismatchException;
import java.util.Scanner;

class DecimalHex {
    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter a decimal.");
            int n = read.nextInt();
            java.lang.String hexa = "";
            System.out.println("The hexadecimal of " + n + " is: ");
            System.out.print("OX");
            while (n > 0) {
                switch (n % 16) {
                case 0:
                    hexa = hexa.concat("0");
                    break;
                case 1:
                    hexa = hexa.concat("1");
                    break;
                case 2:
                    hexa = hexa.concat("2");
                    break;
                case 3:
                    hexa = hexa.concat("3");
                    break;
                case 4:
                    hexa = hexa.concat("4");
                    break;
                case 5:
                    hexa = hexa.concat("5");
                    break;
                case 6:
                    hexa = hexa.concat("6");
                    break;
                case 7:
                    hexa = hexa.concat("7");
                    break;
                case 8:
                    hexa = hexa.concat("8");
                    break;
                case 9:
                    hexa = hexa.concat("9");
                    break;
                case 10:
                    hexa = hexa.concat("A");
                    break;
                case 11:
                    hexa = hexa.concat("B");
                    break;
                case 12:
                    hexa = hexa.concat("C");
                    break;
                case 13:
                    hexa = hexa.concat("D");
                    break;
                case 14:
                    hexa = hexa.concat("E");
                    break;
                case 15:
                    hexa = hexa.concat("F");
                    break;
                }
                n /= 16;
            }
            StringBuffer rev = new StringBuffer(hexa);
            // because octal is stored in reverse order,we reverse the string using
            // stringBuffer
            hexa = (rev.reverse()).toString();
            System.out.println(hexa);
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Error in input");
        }
    }
}