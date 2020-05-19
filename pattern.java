class pattern {
	public static void main(String args[]) {
		int a = 0;
		while (a >= 100) {
			if (a == 11 || a == 21 || a == 31 || a == 41 || a == 51)
				System.out.println();
			else
				System.out.print("*");

			a++;
		}
	}
}