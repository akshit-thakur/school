//class X program. Edited on 29/7/19
class Employee {
	private static int empno;
	private static java.lang.String ename;
	private static float basic_pay;

	public Employee() {
		empno = 0;
		ename = "";
		basic_pay = 0.0f;
	}

	public Employee(int en, float bp, java.lang.String nam) {
		empno = en;
		basic_pay = bp;
		ename = nam;
	}

	void DispDetail() {
		System.out.println("Emp. Name: " + ename);
		System.out.println("Emp. No. " + empno);
		System.out.println("Basic Pay: " + basic_pay);
	}

	public static void main(String args[]) {
		System.out.println("Default Constructor");
		Employee obj = new Employee();
		obj.DispDetail();
		System.out.println("Parameterized counstructor");
		Employee obj1 = new Employee(1, 70000, "Akshit");
		obj1.DispDetail();
	}
}
// 9th May,2013
