class Pattern3 {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int k = 5 - i; k >= 1; k--)
				System.out.print("  ");
			for (int j = i; j > 1; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
		}
	}
}
