class Reverse {
	public static void main(String args[]) {
		int num = 12345, d;
		System.out.println("The reverse of " + num + " is: ");
		while (num > 0) {
			d = num % 10;
			System.out.print(d);
			num = num / 10;
		}
	}
}