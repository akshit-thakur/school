import java.util.Scanner;

class TempConvMenu {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 1 for F to C degrees conv. and 2 for vice versa.");
        int choice = read.nextInt();
        System.out.println("Enter the temperature.");
        float val = read.nextFloat();
        switch (choice) {
        case 1:
            FtoC(val);
            break;
        case 2:
            CtoF(val);
            break;
        default:
            System.out.println("Invalid.");
        }
        read.close();
    }

    public static void FtoC(float x) {
        float y = (x - 32) / 1.8f;
        System.out.println("The value of " + x + "F in Cesius is: " + y);
    }

    public static void CtoF(float x) {
        double y = (x * 1.8) + 32.0f;
        System.out.println("The value of " + x + "C in Fahrenheit is: " + y);
    }
}