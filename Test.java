class Test {
	public static double a = 9.1;

	public static void main(String args[]) {
		area(a);
	}

	public static void area(double x) {
		double digit = (int) (x % 10);
		if (digit > 5)
			digit = digit + 1;
		else
			digit = x;
		System.out.println(digit);
	}
}
