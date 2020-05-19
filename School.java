class School {
	private int roll;
	private java.lang.String name;
	private static java.lang.String school = "St. Xavier's Senior Secondary School";

	School() // default constructor
	{
		roll = 0;
		name = " ";
	}

	School(int x, java.lang.String y) {
		roll = x;
		name = y;
	}

	public void DispDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll No. : " + roll);
		System.out.println("School: " + school);
	}

	public static void main(String args[]) {
		School obj = new School();
		School obj1 = new School(5, "Akshit");
		System.out.println("In default constructor.");
		obj.DispDetails();
		System.out.println("In parameterized constructor.");
		obj1.DispDetails();
	}
}
