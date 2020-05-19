import java.util.Scanner;

class Table {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = read.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(n + "*" + i + "=" + (n * i));
        read.close();
    }
}
