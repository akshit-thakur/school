import java.util.Scanner;

class DiscountCalc {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your total amount of purchase.");
        int purchase = read.nextInt();
        if (purchase > 1000) {
            int discount = (purchase) / 10;
            int price = purchase - discount;
            System.out.println("The discounted price @10% is: " + price);
        } else
            System.out.println("No discount.");
        read.close();
    }
}
