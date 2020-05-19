class Arithmetic {
	private static int a, b; // variables accesible within the class only
	// default constructor

	Arithmetic() {
		a = 2; // default value of a is 2
		b = 1; // default value of b is 1
	}

	// parameterized constructor
	Arithmetic(int x, int y) {
		a = x;
		b = y;
	}

	// method to display the operations done on a and b
	void display() {
		System.out.println("a: " + a + " b: " + b); // displays the values of a and b
		System.out.println("The sum is: " + (a + b)); // displays the sum of a and b
		System.out.println("The difference is: " + (a - b)); // displays difference
		System.out.println("The product is: " + (a * b)); // displays product
		System.out.println("The quotient is: " + (a / b)); // displays quotient
	}

	public static void main(String args[]) {
		System.out.println("Default Constructor called...");
		Arithmetic obj = new Arithmetic(); // Default Constructor called
		obj.display(); // method invoked with default values of a and b
		System.out.println("Parameterized Constructor called...");
		Arithmetic obj1 = new Arithmetic(40, 20); // Parameterized Constructor called
		obj1.display(); // method invoked with parameterized values of a and b
	}
}