import java.util.Scanner;

class HcfLcm {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the two numbers you want to find LCM and HCF of: ");
        int a = read.nextInt();
        int b = read.nextInt();
        getLcm(a, b);
        getHcf(a, b);
        read.close();
    }

    public static void getLcm(int a, int b) {
        int p = a * b;
        int m = Math.max(a, b);
        for (int i = (m + 1); i <= p; i++) {
            if (b % a == 0 || a % b == 0) {
                System.out.print("The LCM is ");
                if (b % a == 0) {
                    System.out.println(b);
                } else {
                    System.out.println(a);
                }
                break;
            } else if (p % i == 0 && i % a == 0 && i % b == 0) {
                p = i;
                System.out.println(p + " is the LCM ");
                break;
            }
        }

    }

    public static void getHcf(int a, int b) {
        int n = Math.max(a, b);
        int d = Math.min(a, b);
        int result = n % d;
        while (result != 0) {
            result = n % d;
            n = d;
            if (result != 0) {
                d = result;
            }
        }
        System.out.println(d + " is the HCF.");
    }
}
