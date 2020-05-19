class TrianglePkg {
	// EDCBA
	// EDCB
	// EDC
	// ED
	// E
	public static void triangle1() {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j >= i; j--) {
				System.out.print(j);
			}
		}
		System.out.println();
	}

	// ABCDE
	// ABCD
	// ABC
	// AB
	// A
	public static void triangle2() {
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

	// 54321
	// 5432
	// 543
	// 54
	// 5
	public static void triangle3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

	// 12345
	// 1234
	// 123
	// 12
	// 1
	public static void triangle4() {
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	// 1
	// 22
	// 333
	// 4444
	// 55555
	public static void triangle5() {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void triangle6() // prints inverted pattern of triangle5
	{
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
	}

	// 43210
	// 3210
	// 210
	// 10
	// 0
	public static void triangle7() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

	// 54321
	// 4321
	// 321
	// 21
	// 1
	public static void triangle8() {
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

	// 12345
	// 2345
	// 345
	// 45
	// 5
	public static void triangle9() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String args[]) {
		triangle1();
		triangle2();
		triangle3();
		triangle4();
		triangle5();
		triangle6();
		triangle7();
		triangle8();
		triangle9();
	}
}