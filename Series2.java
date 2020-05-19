//to print 1/2+3/4+.....+19/20
class Series2 {
	public static void main(String args[]) {
		double i, j, s = 0;
		for (i = 1; i <= 19; i += 2) {
			j = i + 1;
			double k = i / j;
			s = s + k;
		}
		System.out.println(s);
	}
}
