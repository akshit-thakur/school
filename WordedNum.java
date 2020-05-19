import java.util.InputMismatchException;
import java.util.Scanner;

class WordedNum {
    void singleWord(int n) {
        switch (n) {
        case 0:
            System.out.print("Zero");
            break;
        case 1:
            System.out.print("One");
            break;
        case 2:
            System.out.print("Two");
            break;
        case 3:
            System.out.print("Three");
            break;
        case 4:
            System.out.print("Four");
            break;
        case 5:
            System.out.print("Five");
            break;
        case 6:
            System.out.print("Six");
            break;
        case 7:
            System.out.print("Seven");
            break;
        case 8:
            System.out.print("Eight");
            break;
        case 9:
            System.out.print("Nine");
            break;
        default:
            System.out.println("Invalid");
        }
    }

    void doubleWord(int n) {
        int d = n / 10;
        int r = n % 10;
        switch (d) {
        case 1:
            specialNum(n);
            break;
        case 2:
            System.out.print("Twenty ");
            break;
        case 3:
            System.out.print("Thity ");
            break;
        case 4:
            System.out.print("Forty ");
            break;
        case 5:
            System.out.print("Fifty ");
            break;
        case 6:
            System.out.print("Sixty ");
            break;
        case 7:
            System.out.print("Seventy ");
            break;
        case 8:
            System.out.print("Eightty ");
            break;
        case 9:
            System.out.print("Ninety ");
            break;
        default:
            System.out.println("Invalid");
        }
        if (r != 0 && d != 1) {
            singleWord(r);
        }
    }

    void tripleWord(int n) {
        int d = n / 100;
        int r = n % 100;
        switch (d) {
        case 1:
            System.out.print("One hundred ");
            break;
        case 2:
            System.out.print("Two  hundred ");
            break;
        case 3:
            System.out.print("Three  hundred ");
            break;
        case 4:
            System.out.print("Four  hundred ");
            break;
        case 5:
            System.out.print("Five  hundred ");
            break;
        case 6:
            System.out.print("Six  hundred ");
            break;
        case 7:
            System.out.print("Seven  hundred ");
            break;
        case 8:
            System.out.print("Eight  hundred ");
            break;
        case 9:
            System.out.print("Nine  hundred ");
            break;
        default:
            System.out.println("Invalid");
        }
        if (r != 0) {
            doubleWord(r);
        }
    }

    void quadWord(int n) {
        int d = n / 1000;
        int r = n % 1000;
        switch (d) {
        case 1:
            System.out.print("One thousand ");
            break;
        case 2:
            System.out.print("Two thousand ");
            break;
        case 3:
            System.out.print("Three thousand ");
            break;
        case 4:
            System.out.print("Four thousand ");
            break;
        case 5:
            System.out.print("Five thousand ");
            break;
        case 6:
            System.out.print("Six thousand ");
            break;
        case 7:
            System.out.print("Seven thousand ");
            break;
        case 8:
            System.out.print("Eight thousand ");
            break;
        case 9:
            System.out.print("Nine thousand ");
            break;
        default:
            System.out.println("Invalid");
        }
        if (r != 0) {
            tripleWord(r);
        }
    }

    void specialNum(int n) {
        switch (n) {
        case 10:
            System.out.print("Ten.");
            break;
        case 11:
            System.out.print("Eleven.");
            break;
        case 12:
            System.out.print("Twelve.");
            break;
        case 13:
            System.out.print("Thirteen.");
            break;
        case 14:
            System.out.print("Fourteen.");
            break;
        case 15:
            System.out.print("Fifteen.");
            break;
        case 16:
            System.out.print("Sixteen.");
            break;
        case 17:
            System.out.print("Seventeen.");
            break;
        case 18:
            System.out.print("Eighteen.");
            break;
        case 19:
            System.out.print("Nineteen.");
            break;
        default:
            System.out.println("Invalid");
        }
    }

    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            WordedNum obj = new WordedNum();
            System.out.println("Enter a number:");
            int n = read.nextInt();
            java.lang.String num = Integer.toString(n);
            int len = num.length();
            switch (len) {
            case 1:
                obj.singleWord(n);
                break;
            case 2:
                obj.doubleWord(n);
                break;
            case 3:
                obj.tripleWord(n);
                break;
            case 4:
                obj.quadWord(n);
                break;
            default:
                System.out.println("Invalid");
            }
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}