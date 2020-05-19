import java.io.*;

class KBC {
	public static void yes() {
		System.out.println("Correct Answer! Well Played");
		System.out.println("Next Question.");
	}

	public static void no() {
		System.out.println("Wrong Answer.");
		System.out.println("You won: ");
	}

	public static void stage() {
		System.out.println("1.Rs 5,000\n2.Rs 10,000\n3.Rs 20,000\n4.Rs 40,000\n5.Rs 80,000\n6. Rs 1,60,000");
		System.out.println("7.Rs 3,20,000\n8.Rs. 6,40,000\n9.Rs 12,50,000\n10 Rs 25,00,000\n11.Rs 50,00,000");
		System.out.println("12.Rs 1 Crores\n13.Rs 5 Crores\nChoose your ");
	}

	public static void choose(int x) {
		switch (x) {
		case 1:
			System.out.println("You chose 50-50");
			lifeline1();
			break;
		case 2:
			System.out.println("You chose Phone-A-Friend.");
			lifeline2();
			break;
		case 3:
			System.out.println("You chose Audience Poll.");
			lifeline3();
			break;
		case 4:
			System.out.println("You chose Expert Advice.");
			lifeline4();
			break;
		default:
			System.out.println("Not a lifeline :(");
		}
	}

	public static void choice(int x) {
		switch (x) {
		case 1:
			System.out.println("Your is : Rs.5,000");
			break;
		case 2:
			System.out.println("Your is : Rs. 10,000");
			break;
		case 3:
			System.out.println("Your is : Rs. 20,000");
			break;
		case 4:
			System.out.println("Your is : Rs. 40,000");
			break;
		case 5:
			System.out.println("Your is : Rs. 80,000");
			break;
		case 6:
			System.out.println("Your is : Rs. 1,60,000");
			break;
		case 7:
			System.out.println("Your is : Rs. 3,20,000");
			break;
		case 8:
			System.out.println("Your is : Rs. 6,40,000");
			break;
		case 9:
			System.out.println("Your is : Rs. 12,50,000");
			break;
		case 10:
			System.out.println("Your is : Rs. 25,00,000");
			break;
		case 11:
			System.out.println("Your is : Rs. 50,00,000");
			break;
		case 12:
			System.out.println("Your is : Rs. 1 Crores");
			break;
		case 13:
			System.out.println("Your is : Rs. 5 Crores");
			break;
		default:
			System.out.println("Invalid.");
		}
	}

	public static void lifeline() {
		System.out.println("You have 4 life lines:-");
		System.out.println("1. 50-50.");
		System.out.println("2. Phone-A-Friend.");
		System.out.println("3. Audience Poll.");
		System.out.println("4. Expert Advice.");
		System.out.println(
				"1 time chance for the question. Press y if you want to choose lifeline or press any other key.");
	}

	public static void lifeline1() {
		System.out.println("You have 3 life lines:-");
		System.out.println("1. Phone-A-Friend.");
		System.out.println("2. Audience Poll.");
		System.out.println("3. Expert Advice.");
		System.out.println(
				"1 time chance for the question. Press y if you want to choose lifeline or press any other key.");
	}

	public static void lifeline2() {
		System.out.println("You have 3 life lines:-");
		System.out.println("1. 50-50");
		System.out.println("2. Audience Poll.");
		System.out.println("3. Expert Advice.");
		System.out.println(
				"1 time chance for the question. Press y if you want to choose lifeline or press any other key.");
	}

	public static void lifeline3() {
		System.out.println("You have 3 life lines:-");
		System.out.println("1. 50-50");
		System.out.println("2. Phone-A-Friend.");
		System.out.println("3. Expert Advice.");
		System.out.println(
				"1 time chance for the question. Press y if you want to choose lifeline or press any other key.");
	}

	public static void lifeline4() {
		System.out.println("You have 3 life lines:-");
		System.out.println("1. 50-50");
		System.out.println("2. Audience Poll.");
		System.out.println("3. Expert Advice.");
		System.out.println(
				"1 time chance for the question. Press y if you want to choose lifeline or press any other key.");
	}

	public static void main(String args[]) throws IOException {
		InputStreamReader rdr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(rdr);
		System.out.println("WELCOME TO KBC");
		stage();
		int s = Integer.parseInt(input.readLine());
		choice(s);
		System.out.println("Question 1 for Rs.5000\n");
		System.out.println(""); // question 1 starts here
		System.out.println("A.\tB.\nC.\tD.");
		lifeline();
		char life = (char) input.read();
		if (life == 'y') {
			System.out.println("Enter 1-4.");
			int n = Integer.parseInt(input.readLine());
			choose(n);
		} else {
			System.out.println("Enter your choice.If you want to quit,press Q");
			int ch = Integer.parseInt(input.readLine());
			if (ch == 'A' || ch == 'a')
				yes();
			else if (ch == 'Q' || ch == 'q')
				System.out.println("You quit and win ");
			else
				no();
			System.out.println("Prize Money: Rs 0");
		}
	}
}