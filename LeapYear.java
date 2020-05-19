
import java.util.Scanner;

class LeapYear {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a year.");
        int yr = read.nextInt();
        if ((yr % 100) == 0) {
            if (yr % 400 == 0) {
                System.out.println(yr + " is a century year and leap year.");
            } else {
                System.out.println(yr + " is a century year but not a leap year.");
            }
        } else if (yr % 4 == 0) {
            System.out.println(yr + " is a leap year.");
        } else {
            System.out.println(yr + " is a not leap year.");
        }
        read.close();
    }
}
