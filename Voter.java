import java.util.Scanner;
class Voter{
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=read.nextInt();
		if(age<=18)
			System.out.println("You can vote");
		else
			System.out.println("You can't vote.");
		read.close();
	}
}
