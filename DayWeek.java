import java.io.IOException;
import java.util.Scanner;

class DayWeek {
    public static void main(String args[]) throws IOException {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of day :");
        int n = read.nextInt();
        System.out.print("It is : ");
        switch (n) {
        case 1:
            System.out.println("Monday.");
            break;
        case 2:
            System.out.println("Tuesday.");
            break;
        case 3:
            System.out.println("Wednesday.");
            break;
        case 4:
            System.out.println("Thursday.");
            break;
        case 5:
            System.out.println("Friday.");
            break;
        case 6:
            System.out.println("Saturday.");
            break;
        case 7:
            System.out.println("Sunday.");
            break;
        default:
            System.out.println("Invliad.");
        }
        read.close();
    }
}