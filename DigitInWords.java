import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DigitInWords {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a digit: ");
        char ch = (char) input.read();
        java.lang.String word = "";
        switch (ch) {
        case '0':
            word = "Zero";
            break;
        case '1':
            word = "One";
            break;
        case '2':
            word = "Two";
            break;
        case '3':
            word = "Three";
            break;
        case '4':
            word = "Four";
            break;
        case '5':
            word = "Five";
            break;
        case '6':
            word = "Six";
            break;
        case '7':
            word = "Seven";
            break;
        case '8':
            word = "Eight";
            break;
        case '9':
            word = "Nine";
            break;
        default:
            System.out.println("Invalid. Single digit only");
        }
        System.out.println(ch + " in words is :" + word);
    }
}