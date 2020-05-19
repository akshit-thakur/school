class Formation {
	public static void form1() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 5 - i; k > 0; k--) {
				System.out.print("  ");
			}
			for (int j = i; j > 1; j--) {
				System.out.print(j + " ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void form2() {
		for (int i = 5; i > 0; i--) {
			for (int k = 5 - i; k > 0; k--) {
				System.out.print("  ");
			}
			for (int j = i; j > 1; j--) {
				System.out.print(j + " ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void form3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int k = 4; k > 0; k--) {
			for (int l = k; l <= 5; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void form4() {
		int n = 1, j = 5, k = (j - 1), l = (j + 1);
		while (n < 11) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(i);
				if (i == j) {
					System.out.print(" ");
					i += 1;
				}
				if (n != 1) {
					if (i == l)
						System.out.print(" ");
					if (i == k)
						System.out.print(" ");
				}
			}
			System.out.println();
			n++;
		}
	}

	public static void main(String args[]) {
		form1();
		form2();
		form3();
		form4();
	}
}