//demo of using constructor. Modified 29/7/19
class BankAccount {
	// variables accessible within the class only
	private int no; // acc no.
	private java.lang.String name; // customer's name
	private double bal; // balance in the acc.

	BankAccount() { // default constructor{
		no = 0; // vaules initialized
		name = " ";
		bal = 0.0d;
	}

	BankAccount(int n, java.lang.String nam, double bal) {
		this.no = n;
		this.name = nam;
		this.bal = bal;
	}

	void dispDetails() { // method made to display acc. details
		System.out.println("Account Number: " + no); // Prints the acc. no.
		System.out.println("Customer's Name: " + name); // Prints the Customer's Name
		System.out.println("Balance: " + bal); // Prints the Balance in the account
	}

	public static void main(String args[]) {
		BankAccount obj = new BankAccount(); // default constructor called
		obj.dispDetails(); // method invoked with default values of variables
		BankAccount obj1 = new BankAccount(9, "Akshit", 70000);
		obj1.dispDetails();
	}
}
// 9th May,2013