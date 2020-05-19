//prints alphabetic diamond
class CharDiamond {
	public static void main(String args[]) {
		char n = 'e', d = 'd'; // values initialized
		UpperHalf(n); // method called
		LowerHalf(d); // method called
	}

	public static void UpperHalf(char s) // method made
	{
		for (char x = 'a'; x <= s; x++) // outer loop
		{
			System.out.println(); // cursor moved to next line
			for (char z = (char) (s - x); z >= 'a'; z--) // spaces loop
			{
				System.out.print("  "); // double space
			}
			for (char y = x; y > 'a'; y--) // pattern print LHS
			{
				System.out.print(y + " "); // prints the value of y with 1 space
			}
			for (char y = 'a'; y <= x; y++) // pattern print RHS
			{
				System.out.print(y + " "); // prints the value of y with 1 space
			}
		}
	}

	public static void LowerHalf(char s) {
		for (char x = s; x >= 'a' - 1; x--) {
			System.out.println();
			for (char z = (char) (s - x); z >= 'a'; z--) {
				System.out.print("  ");
			}
			for (char y = x; y > 'a'; y--) {
				System.out.print(y + " ");
			}
			for (char y = 'a'; y <= x; y++) {
				System.out.print(y + " ");
			}
		}
	}
}
