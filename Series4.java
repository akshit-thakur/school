//to print the series upto ten terms... 1,11,111,1111......
class Series4 {
	public static void main(String args[]) {
		Series4 obj = new Series4();
		obj.series(0, 0, 0);
	}

	void series(int x, int y, double z) {
		for (x = 0; x <= 9; x++) {
			z += (Math.pow(10, x));
			y = (int) z;
			System.out.print(y + "	");
		}
	}
}
// class X prog
