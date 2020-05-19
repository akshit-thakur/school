class Pattern2 {
	public static void main(String args[]) {
		int j; // because j is initialized twice :P
		for (int x = 1; x <= 4; x++) {
			int a = 1;
			while (a <= 11) {
				if (a == 11) {
					System.out.println();
					break;
				}
				if (a == 5 && x == 1) {
					for (int i = 1; i <= 4; i++) {
						System.out.println();
						for (int k = 4 - i; k >= 1; k--)
							System.out.print("  ");
						for (j = i; j > 1; j--)
							System.out.print(" ");
						for (j = 1; j <= i; j++)
							System.out.print(" ");
					}
				}
				System.out.print("*");
				a++;
			}
		}
	}
}
