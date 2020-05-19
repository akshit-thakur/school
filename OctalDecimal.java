import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OctalDecimal {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter a octal number.");
        java.lang.String octal = input.readLine();
        int len = octal.length();
        char a[] = new char[len];
        for (int i = len - 1; i >= 0; i--) {
            a[i] = octal.charAt(i);
        }
        int p = 0, dec = 0;
        for (int i = len - 1; i >= 0; i--) {
            char ch = octal.charAt(i);
            switch (ch) {
            // case '0': no change if used
            case '1':
                dec += Math.pow(8, p);
                break;
            case '2':
                dec += (2 * (Math.pow(8, p)));
                break;
            case '3':
                dec += (3 * (Math.pow(8, p)));
                break;
            case '4':
                dec += (4 * (Math.pow(8, p)));
                break;
            case '5':
                dec += (5 * (Math.pow(8, p)));
                break;
            case '6':
                dec += (6 * (Math.pow(8, p)));
                break;
            case '7':
                dec += (7 * (Math.pow(8, p)));
                break;
            }
            p++;
        }
        System.out.println("The decimal of octal " + octal + " is : " + dec);
    }
}