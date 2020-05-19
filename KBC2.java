
//9:08 PM 6/30/2014
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

class KBC2 {
	int num = 0;

	public static void main(String args[]) throws IOException {
		KBC2 obj = new KBC2();
		System.out.println("----------------Welcome to KBC---------------");
		char z = obj.rules();
		if (z == 'n') {
			System.out.println("O.K. Try again later!!");
		} else if (z == 'y') {
			obj.stage();
			// obj.choose();
			obj.disp1();
			// obj.do1();
			switch (obj.num) {
			case 1:
				obj.disp2();
				obj.do2();
				break;
			/**
			 * case 2: disp3(); do3(); break; case 3: disp4(); do4(); break; case 4:
			 * disp5(); do5(); break; case 5: disp6(); do6(); break; case 6: disp7(); do7();
			 * break; case 7: disp8(); do8(); break; case 8: disp9(); do9(); break; case 9:
			 * disp10(); do10(); break; case 10: disp11(); do11(); break; case 11: disp12();
			 * do12(); break; case 12: disp13(); do13(); break; case 13: disp14(); do14();
			 * break; case 14: disp15(); do15(); break;
			 */
			default:
				System.out.println();
			}
		} else {
			System.out.println("Invalid.");
		}
	}

	// Methods display the fifteen question.Started 12:59 PM 7/2/2014
	void disp1() {
		System.out.println("Question 1. Who is the President of India? ");
		System.out.println("A. Pranab Mukherjee.\tC. Dr. A.P.J. Abdul Kalam");
		System.out.println("B. Pratibha Patil.\tD. Dr. Rajendra Prasad");
	}

	void do1() throws IOException {
		Scanner read = new Scanner(System.in);
		lifeline();
		System.out.println("Do you want a lifeline. Press y for yes and n for no");
		char ch = read.next().charAt(0);
		if (ch == 'y') {
			lifeline(num);
		}
		System.out.println("Enter your choice.Press q to quit.");
		char ch1 = read.next().charAt(0);
		if (ch1 == 'a') {
			yes();
		} else if (ch == 'q') {
			quit();
		} else {
			no();
		}
		read.close();
	}

	void disp2() {
		System.out.println("In Disp2");
	}

	void do2() {
		System.out.println("In Do2");
	}

	/** Methods to display messages on correct,incorrect answers and quitting */
	void yes() {
		num++;
		System.out.println("Correct Answer! Well Played");
		System.out.print("You won Rs. ");
		mark(num);
	}

	void no() {
		System.out.println("Wrong Answer.");
		System.out.print("You won Rs. ");
		mark(num);
	}

	void quit() {
		System.out.print("You quit. \nYou Won Rs");
		mark(num);
	}

	// Method to choose the question number and display the winnings.
	void mark(int x) {
		switch (x) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("5,000");
			break;
		case 2:
			System.out.println("10,000");
			break;
		case 3:
			System.out.println("20,000");
			break;
		case 4:
			System.out.println("40,000");
			break;
		case 5:
			System.out.println("80,000");
			break;
		case 6:
			System.out.println("1,60,000");
			break;
		case 7:
			System.out.println("3,20,000");
			break;
		case 8:
			System.out.println("6,40,000");
			break;
		case 9:
			System.out.println("12,50,000");
			break;
		case 10:
			System.out.println("25 Lacs.");
			break;
		case 11:
			System.out.println("50 Lacs.");
			break;
		case 12:
			System.out.println("1 Crore.");
			break;
		case 13:
			System.out.println("3 Crore.");
			break;
		case 14:
			System.out.println("5 Crores.");
			break;
		case 15:
			System.out.println("7 Crores.");
			break;
		default:
			System.out.println("Error in mark(int x).");
		}
	}

	void stage() {
		System.out.println("1.Rs 5,000\n2.Rs 10,000\n3.Rs 20,000\n4.Rs 40,000\n5.Rs 80,000\n6. Rs 1,60,000");
		System.out.println("7.Rs 3,20,000\n8.Rs. 6,40,000\n9.Rs 12,50,000\n10 Rs 25,00,000\n11.Rs 50,00,000");
		System.out.println("12.Rs 1 Crores\n13.Rs 5 Crores\n14.Rs 7 Crores\nChoose your base: ");
	}

	char rules() throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		System.out.println("You can get the chance to opt for lifeline only once per question.");
		System.out.println("There will be 15 questions asked and you will have 4 lifelines.(No Joker Lifeline)");
		System.out.println("There will be 2 bases. Rs 80,000 and Rs 6,40,000.");
		System.out.println("All input to be given in small letters.");
		System.out.println("Are you ready? Press y or n");
		char x = input.readChar();
		return x;
	}

	// Methods to display the lifelines. Started 8:05 PM 7/2/2014
	void lifeline(int x) throws IOException {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the lifeline number you want from 1 to 4.");
		int m = read.nextInt();
		switch (x) {
		case 0:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 1:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 2:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 3:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 4:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 5:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 6:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 7:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 8:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 9:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 10:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 11:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 12:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 13:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		case 14:
			switch (m) {
			case 1:
				Fifty(x);
				break;
			case 2:
				Phone(x);
				break;
			case 3:
				Audience(x);
				break;
			case 4:
				Flip(x);
				break;
			default:
				System.out.println("Error in input.. Program Ending.!!");
			}
			break;
		default:
			System.out.println("Error in programming,syntax wrong in lifeline(int x)");
		}
		read.close();
	}

	void lifeline() {
		System.out.println("You have 4 life lines:-");
		System.out.println("1. 50-50.");
		System.out.println("2. Phone-A-Friend.");
		System.out.println("3. Audience Poll.");
		System.out.println("4. Flip the question.");
	}

	void Fifty(int x) {
		switch (x) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		default:
			System.out.println("Error in programming,syntax wrong in Fifty(int x)");
		}
	}

	void Phone(int x) {
		switch (x) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		default:
			System.out.println("Error in programming,syntax wrong in Phone(int x)");
		}
	}

	void Audience(int x) {
		switch (x) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		default:
			System.out.println("Error in programming,syntax wrong in Audience(int x)");
		}
	}

	void Flip(int x) {
		switch (x) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		default:
			System.out.println("Error in programming,syntax wrong in Flip(int x)");
		}
	}
}
