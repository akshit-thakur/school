class Student {
	private int age, m1, m2, m3, avg, max;
	private java.lang.String name;

	Student(java.lang.String a, int b, int c, int d, int e) {
		name = a;
		age = b;
		m1 = c;
		m2 = d;
		m3 = e;
	}

	void compute() {
		avg = (m1 + m2 + m3) / 3;
		if (m1 > m2 && m1 > m3)
			max = m1;
		else if (m2 > m1 && m2 > m3)
			max = m2;
		else
			max = m3;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + m1 + "," + m2 + "," + m3);
		System.out.println("Average is: " + avg);
		System.out.println("Maximum marks gained: " + max);
	}

	public static void main(String args[]) {
		Student obj = new Student("Akshit", 15, 92, 93, 96);
		obj.compute();
		obj.display();
	}
}