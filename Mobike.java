class Mobike {
	private int bno, phno, days, charge;
	private java.lang.String name;

	void input() {
		bno = 12;
		phno = 234432;
		days = 14;
		name = "Biker Ace";
	}

	void compute() {
		if (days <= 5)
			charge = days * 500;
		else if (days > 5 && days <= 10)
			charge = 5 * 500 + (days - 5) * 400;
		else
			charge = (5 * 500 + 5 * 400) + (days - 10) * 200;
	}

	void display() {
		System.out.println("Bike No\tPhone No.\tName\t\tNo. of Days\tCharges");
		System.out.println(bno + "\t" + phno + "\t\t" + name + "\t" + days + "\t\t" + charge);
	}

	public static void main(String args[]) {
		Mobike obj = new Mobike();
		obj.input();
		obj.compute();
		obj.display();
	}
}
