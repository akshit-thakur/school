//class X prog
class Triangle {
	public static void main(String args[]) {
		int i = 1, j = 1, k = 4, l = 1;
		formation(i, j);
		formation1(k, l);
	}

	public static void formation(int a, int b) {
		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= a; b++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void formation1(int x, int y) {
		for (x = 4; x >= 1; x--) {
			for (y = 1; y <= x; y++)
				System.out.print("*");
			System.out.println();
		}
	}
}