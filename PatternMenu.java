import java.util.Scanner;

class PatternMenu {
    public static void Diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 5 - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = (n - 1); i >= 1; i--) {
            for (int k = 5 - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void IsoTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 5 - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void RightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void InvertedRight(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println();
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
        }
    }

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 1 for Diamond. ");
        System.out.println("Enter 2 for Isosceles Triangle. ");
        System.out.println("Enter 3 for Right Angled Triangle. ");
        System.out.println("Enter 4 for Inverted Right Angled Triangle. ");
        System.out.print("Enter the corresponding number ");
        int choice = read.nextInt();
        System.out.println("Enter the number of rows.");
        int n = read.nextInt();
        switch (choice) {
        case 1:
            Diamond(n);
            break;
        case 2:
            IsoTriangle(n);
            break;
        case 3:
            RightTriangle(n);
            break;
        case 4:
            InvertedRight(n);
            break;
        default:
            System.out.println("Error in choice .");
        }
        read.close();
    }
}
