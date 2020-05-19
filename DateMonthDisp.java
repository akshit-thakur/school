
//class X program
import java.util.Scanner;

class DateMonthDisp {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter date: ");
		int d = read.nextInt();
		System.out.println("Enter month: ");
		int m = read.nextInt();
		if (d > 31) {
			System.out.println("Invalid date");
		} else {
			switch (m) {
			case 1:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th January.");
				} else if (d == 1 || d == 21 || d == 31) {
					System.out.println(d + "st January.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd January.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd January.");
				}
				break;
			case 2:
				if (d >= 4 && d < 29 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th February.");
				} else if (d == 1 || d == 21) {
					System.out.println(d + "st February.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd February.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd February.");
				} else {
					System.out.println("Feb can't have more than 28 days.");
				}
				break;
			case 3:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th March.");
				} else if (d == 1 || d == 21 || d == 31) {
					System.out.println(d + "st March.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd March.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd March.");
				} else {
					System.out.println("March can't have 31 days.");
				}
				break;
			case 4:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th April.");
				} else if (d == 1 || d == 21) {
					System.out.println(d + "st April.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd April.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd April.");
				} else {
					System.out.println("April can't have 31 days.");
				}
				break;
			case 5:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th May.");
				} else if (d == 1 || d == 21 || d == 31) {
					System.out.println(d + "st May.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd May.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd May.");
				}
				break;
			case 6:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th June.");
				} else if (d == 1 || d == 21) {
					System.out.println(d + "st June.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd June.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd June.");
				} else {
					System.out.println("June can't have 31 days.");
				}
				break;
			case 7:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th July.");
				} else if (d == 1 || d == 21 || d == 31) {
					System.out.println(d + "st July.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd July.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd July.");
				}
				break;
			case 8:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th August.");
				} else if (d == 1 || d == 21 || d == 31) {
					System.out.println(d + "st August.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd August.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd August.");
				}
				break;
			case 9:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th September .");
				} else if (d == 1 || d == 21) {
					System.out.println(d + "st September .");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd September .");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd September .");
				} else {
					System.out.println("September can't have 31 days.");
				}
				break;
			case 10:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th October.");
				} else if (d == 1 || d == 31 || d == 21) {
					System.out.println(d + "st October.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd October.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd October.");
				}
				break;
			case 11:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th June.");
				} else if (d == 1 || d == 21) {
					System.out.println(d + "st June.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd June.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd June.");
				} else {
					System.out.println("November can't have 31 days.");
				}
				break;
			case 12:
				if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
					System.out.println(d + "th December.");
				} else if (d == 1 || d == 31 || d == 21) {
					System.out.println(d + "st December.");
				} else if (d == 2 || d == 22) {
					System.out.println(d + "nd December.");
				} else if (d == 3 || d == 23) {
					System.out.println(d + "rd December.");
				}
				break;
			default:
				System.out.println("Invalid month.");
			}
		}
		read.close();
	}
}