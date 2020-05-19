import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Banking {
    static double sum = 50000.00;

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void Deposit() throws IOException {
        System.out.println("Enter how much you want to deposit in decimals");
        double d = Double.parseDouble(input.readLine());
        int flag = 1;
        GetBal(d, flag);
    }

    public static void Withdraw() throws IOException {
        System.out.println("Enter how much you want to withdraw in decimals");
        double w = Double.parseDouble(input.readLine());
        int flag = 2;
        GetBal(w, flag);
    }

    public static void GetBal(double x, int flag) {
        if (flag == 1)
            sum += x;
        else if (flag == 2)
            sum -= x;
    }

    public static void display(java.lang.String name, long number, double sum) {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + number);
        System.out.println("Balance: " + sum);
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Welcome to XYZ Bank");
        System.out.println("Enter your name,please:");
        java.lang.String name = input.readLine();
        System.out.println("Enter your account number,please:");
        long number = Long.parseLong(input.readLine());
        System.out.println("What do you want to do.");
        System.out.println("1. Check Balance" + "\n" + "2. Withdraw Money" + "\n" + "3. Deposit Money");
        System.out.println("Enter corresponding number:");
        int choice = Integer.parseInt(input.readLine());
        switch (choice) {
        case 1:
            display(name, number, sum);
            break;
        case 2:
            Withdraw();
            display(name, number, sum);
            break;
        case 3:
            Deposit();
            display(name, number, sum);
            break;
        default:
            System.out.println("Invalid");
        }
    }
}