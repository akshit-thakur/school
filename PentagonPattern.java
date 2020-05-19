class PentagonPattern {
	public static void main(String agrs[]) {
		int a = 1;
		while (a < 50) {
			int j;
			for (int i = 1; i <= 5; i++) {
				System.out.println();
				for (int k = 5 - i; k > 1; k--) {
					System.out.print("  ");
				}
				for (j = 1; j <= i; j--) {
					System.out.print("* ");
				}
				for (j = i; j < 5; j--) {
					System.out.print("* ");

					if (a == 10 || a == 20 || a == 30 || a == 40) {
						System.out.println();
					}
					if (a == 7 || a == 4 || a == 5 || a == 6) {
						System.out.print("*");
					}
					if (a == 12 || a == 13 || a == 14 || a == 15 || a == 16) {
						System.out.print("*");
					}
					if (a == 21 || a == 22 || a == 23 || a == 24 || a == 25 || a == 26 || a == 27) {
						System.out.print("*");
					}
					if (a == 32 || a == 33 || a == 34 || a == 35 || a == 36) {
						System.out.print("*");
					}
					if (a == 43 || a == 44 || a == 45 || a == 46) {
						System.out.print("*");
					}
					System.out.print(" ");
					a++;
				}
			}
		}
	}
}
