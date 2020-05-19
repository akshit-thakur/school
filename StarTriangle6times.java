class StarTriangle6times {
	public static void main(String args[]) {
		int a, i, j;
		do {
			for (a = 1; a <= 10; a++) {
				for (i = 1; i <= 10; i++) {
					for (j = 1; j <= i; j++) {
						System.out.print('*');
					}
					System.out.println();
				}
			}
		} while (a <= 5);
		System.out.print('*' + "/t");
	}
}
