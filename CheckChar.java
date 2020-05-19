import java.io.DataInputStream;
import java.io.IOException;

class CheckChar {
    public static void main(String args[]) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        System.out.println("Enter a number or letter.");
        char ch = (char) input.read();
        if (ch >= 'a' && ch <= 'z')
            System.out.println("The character is in lowercase");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("The character is in uppercase");
        else if (ch >= '0' && ch <= '9')
            System.out.println("It is a number.");
        else
            System.out.println("Invalid");
    }
}