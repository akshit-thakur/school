import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Encryption {
    java.lang.String message;
    java.lang.String EncMsg;

    Encryption() {
        message = "";
        EncMsg = "";
    }

    void readMessage() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        message = input.readLine();
    }

    java.lang.String Rot13(java.lang.String s) {
        java.lang.String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int n = (int) ch;
            n += 13;
            ch = (char) n;
            str += ch;
        }
        return str;
    }

    void Encrypt() {
        EncMsg = Rot13(message);
    }

    void display() {
        System.out.println("The encrypted message is: " + EncMsg);
    }

    public static void main(String args[]) throws IOException {
        Encryption obj = new Encryption();
        try {
            System.out.println("Enter the message to be encrypted: ");
            obj.readMessage();
            obj.Encrypt();
            obj.display();
        } catch (Exception e) {
            System.out.println("Error in input! Re-enter the message to be encrypted.");
            obj.readMessage();
        }
    }
}