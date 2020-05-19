
//class X prog.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number:");
			a[i] = Integer.parseInt(input.readLine());
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
