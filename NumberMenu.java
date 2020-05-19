import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NumberMenu {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Binary-Decimal");
        System.out.println("2. Decimal-Binary");
        System.out.println("3. Decimal-Octal");
        System.out.println("4. Octal-Decimal");
        System.out.println("5. Binary-Octal");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. ");
        System.out.println("Choose the type of conversion you want.(1-9)");
        int ch = Integer.parseInt(input.readLine());
        System.out.println("You chose : " + ch);
        System.out.println("Enter the number: ");
        switch (ch) {
        case 1:
            java.lang.String a = input.readLine();
            BinaryDecimal(a);
            break;
        case 2:
            int b = Integer.parseInt(input.readLine());
            DecimalBinary(b);
            break;
        case 3:
            int c = Integer.parseInt(input.readLine());
            DecimalOctal(c);
            break;
        case 4:
            java.lang.String d = input.readLine();
            OctalDecimal(d);
            break;
        case 5:
            long e = Long.parseLong(input.readLine());
            BinaryOctal(e);
            break;
        case 6:
            int f = Integer.parseInt(input.readLine());
            OctalBinary(f);
            break;
        default:
            System.out.println("Invalid.");
        }
    }

    public static void BinaryDecimal(java.lang.String a) {
        int len = a.length();
        char s[] = new char[len];
        int n = 0, p = 0;
        for (int i = len; i > 0; i--) {
            char ch = a.charAt(i - 1);
            s[i - 1] = ch;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (s[i] == '1') {
                n += Math.pow(2, p);
                p++;
            } else {
                p++;
            }
        }
        java.lang.String str = java.lang.Character.toString(s);
        System.out.println("The binary: " + s + " is equal to: " + n + " (decimal)");
    }

    public static void DecimalBinary(int n) {
        int i = 100, temp = n;
        int a[] = new int[100];
        while (n > 0) {
            a[i - 1] = n % 2;
            n /= 2;
            i--;
        }
        System.out.println("The number " + temp + " in binary is: ");
        for (int j = i; j < 100; j++) {
            switch (a[j]) {
            case 0:
                System.out.print("0");
                break;
            case 1:
                System.out.print("1");
                break;
            default:
                System.out.println("Invalid.");
            }
        }
    }

    public static void DecimalOctal(int n) {
        int i = 100, temp = n;
        int a[] = new int[100];
        while (n > 0) {
            a[i - 1] = n % 8;
            n /= 8;
            i--;
        }
        System.out.println("The number " + temp + " in octal is: ");
        for (int j = i; j < 100; j++) {
            switch (a[j]) {
            case 0:
                System.out.print("0");
                break;
            case 1:
                System.out.print("1");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            default:
                System.out.println("Invalid.");
            }
        }
    }

    public static void OctalDecimal(java.lang.String s) {
        int len = s.length();
        char a[] = new char[len];
        int p = 0, dec = 0;
        for (int i = len; i > 0; i--) {
            a[i - 1] = s.charAt(i - 1);
        }
        for (int i = len - 1; i >= 0; i--) {
            switch (a[i]) {
            // case '0': because no change will occur break;
            case '1':
                dec += Math.pow(8, p);
                break;
            case '2':
                dec += (2 * Math.pow(8, p));
                break;
            case '3':
                dec += (3 * Math.pow(8, p));
                break;
            case '4':
                dec += (4 * Math.pow(8, p));
                break;
            case '5':
                dec += (5 * Math.pow(8, p));
                break;
            case '6':
                dec += (6 * Math.pow(8, p));
                break;
            case '7':
                dec += (7 * Math.pow(8, p));
                break;
            default:
                System.out.println("Invalid.");
            }
            p++;
        }
        System.out.println("The octal " + s + " in decimal is: " + dec);
    }

    public static void BinaryOctal(long a) {
    }

    public static void OctalBinary(int a) {
    }
}