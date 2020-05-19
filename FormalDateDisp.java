
//incomplete
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FormalDateDisp {
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Enter the date in dd/mm/yyyy format: ");
		java.lang.String date = input.readLine();
		int len = date.length();
		int YearIndex = date.lastIndexOf('/');
		int MonthIndex = date.indexOf('/');
		int d = Integer.parseInt(date.substring(0, 2));
		int month = Integer.parseInt(date.substring((MonthIndex + 1), YearIndex));
		int year = Integer.parseInt(date.substring((YearIndex + 1), len));
		switch (month) {
		case 1:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th January " + year);
			} else if (d == 1 || d == 21 || d == 31) {
				System.out.println(d + "st January " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd January " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd January " + year);
			}
			break;
		case 2:
			if (d >= 4 && d < 29 && d != 21 && d != 22 && d != 23 && year % 4 != 0) {
				System.out.println(d + "th February " + year);
			} else if (d == 1 || d == 21) {
				System.out.println(d + "st February " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd February " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd February " + year);
			} else if (year % 4 == 0 && d == 29) {
				System.out.println(d + "th February " + year);
			} else {
				System.out.println("Invalid date.");
			}
			break;
		case 3:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th March " + year);
			} else if (d == 1 || d == 21 || d == 31) {
				System.out.println(d + "st March " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd March " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd March " + year);
			} else {
				System.out.println("March can't have 31 days.");
			}
			break;
		case 4:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th April " + year);
			} else if (d == 1 || d == 21) {
				System.out.println(d + "st April " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd April " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd April " + year);
			} else {
				System.out.println("April can't have 31 days.");
			}
			break;
		case 5:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th May " + year);
			} else if (d == 1 || d == 21 || d == 31) {
				System.out.println(d + "st May " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd May " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd May " + year);
			}
			break;
		case 6:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th June " + year);
			} else if (d == 1 || d == 21) {
				System.out.println(d + "st June " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd June " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd June " + year);
			} else {
				System.out.println("June can't have 31 days.");
			}
			break;
		case 7:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th July " + year);
			} else if (d == 1 || d == 21 || d == 31) {
				System.out.println(d + "st July " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd July " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd July " + year);
			}
			break;
		case 8:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th August.");
			} else if (d == 1 || d == 21 || d == 31) {
				System.out.println(d + "st August " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd August " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd August " + year);
			}
			break;
		case 9:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th September " + year);
			} else if (d == 1 || d == 21) {
				System.out.println(d + "st September " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd September " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd September " + year);
			} else {
				System.out.println("September can't have 31 days.");
			}
			break;
		case 10:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th October " + year);
			} else if (d == 1 || d == 31 || d == 21) {
				System.out.println(d + "st October " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd October " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd October " + year);
			}
			break;
		case 11:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th November " + year);
			} else if (d == 1 || d == 21) {
				System.out.println(d + "st November " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd November " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd November " + year);
			} else {
				System.out.println("November can't have 31 days.");
			}
			break;
		case 12:
			if (d >= 4 && d < 31 && d != 21 && d != 22 && d != 23) {
				System.out.println(d + "th December " + year);
			} else if (d == 1 || d == 31 || d == 21) {
				System.out.println(d + "st December " + year);
			} else if (d == 2 || d == 22) {
				System.out.println(d + "nd December " + year);
			} else if (d == 3 || d == 23) {
				System.out.println(d + "rd December " + year);
			}
			break;
		default:
			System.out.println("Invalid month.");
		}
	}
}