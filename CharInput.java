
//class X prog
import java.io.DataInputStream;
import java.io.IOException;

class CharInput {
	public static void main(String args[]) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("Enter an alphabet: ");
		char c = (char) in.read();
		int n = c;
		if (n >= 65 && n <= 97)
			System.out.println("The alphabet is in Uppercase.");
		else if (n >= 97 && n <= 122)
			System.out.println("The alphabet is in Lowercase");
		else
			System.out.println("Invalid");
	}
}
