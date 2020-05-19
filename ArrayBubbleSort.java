import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArrayBuubleSort {
	public static void main(String args[]) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[10];
		for (int b = 0; b < 10; b++) {
			System.out.println("Enter a number");
			a[b] = Integer.parseInt(in.readLine());
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < 10; k++)
			System.out.print(a[k] + " ");
	}
}