class Teacher {
	private java.lang.String name, add, sub, special;
	private int sal;

	Teacher() {
		name = "";
		add = "";
		sub = "";
		special = "";
		sal = 0;
	}

	public void DispDetails() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + add);
		System.out.println("Subject: " + sub);
		System.out.println("Specialization: " + special);
		System.out.println("Salary: " + sal);
	}

	public static void main(String args[]) {
		Teacher obj1 = new Teacher();
		System.out.println("In Default Constructor \n ------------");
		obj1.DispDetails(); // default constructor called
		Teacher obj = new Teacher();
		obj.name = "Mrs. Neeraj"; // values invoked in the variables
		obj.add = "House no. 3450, Sec. 41 Chandigarh.";
		obj.sub = "Maths";
		obj.special = "M.A.";
		obj.sal = 170000;
		System.out.println("In Value-Assigned Constructor \n ------------");
		obj.DispDetails(); // default consctuctor called with different values
		if (obj.sal > 175000) {
			int tax = (5 * obj.sal) / 100;
			System.out.println("Income Tax is: " + tax);
		} else
			System.out.println("No Tax");

	}
}
