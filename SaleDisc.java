import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class SaleDisc {
    static int sales = 0;
    static java.lang.String category = "";
    static float discount = 0.0f;

    public static void main(String args[]) throws IOException {
        SaleDisc obj = new SaleDisc();
        int flag = 0;
        try {
            System.out.println("Enter the sales: ");
            flag = 1;
            sales = obj.getSales();
            flag = 2;
            System.out.println("Enter H for handloom and M for mill: ");
            category = obj.getCateg();
            if (!(category.equalsIgnoreCase("h") || category.equalsIgnoreCase("m"))) {
                System.out.println("Please enter H for handloom and M for mill and nothing else:");
                category = obj.getCateg();
            }
        } catch (Exception e) {
            if (flag == 1) {
                System.out.println("Error in Sales input. Re-enter ");
                sales = obj.getSales();
            } else if (flag == 2) {
                System.out.println("Error in Type input. Re-enter ");
                category = obj.getCateg();
            }
        }
        category = category.toLowerCase();
        switch (category) {
        case "h":
            if (sales <= 1000)
                discount = (float) (0.02 * sales);
            else if (sales > 1000 && sales <= 5000)
                discount = (float) (0.07 * sales);
            else if (sales > 5000 && sales <= 8000)
                discount = (float) (0.1 * sales);
            else
                discount = (float) (0.15 * sales);
            break;
        case "m":
            if (sales <= 1000)
                discount = (float) (0.05 * sales);
            else if (sales > 1000 && sales <= 5000)
                discount = (float) (0.09 * sales);
            else if (sales > 5000 && sales <= 8000)
                discount = (float) (0.12 * sales);
            else
                discount = (float) (0.2 * sales);
            break;
        default:
            System.out.println("Error!");
        }
        System.out.print("The category is : ");
        if (category.equals("h"))
            System.out.println("Handloom");
        else
            System.out.println("Mill");
        System.out.println("The sales are Rs." + sales);
        System.out.println("The discount is Rs." + discount);
    }

    int getSales() throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(input.readLine());
            return n;
        } catch (Exception e) {
            System.out.println("Error in Sales input. Re-enter ");
            int n = getSales();
            return n;
        }
    }

    java.lang.String getCateg() {
        try {
            Scanner read = new Scanner(System.in);
            java.lang.String str = read.nextLine();
            read.close();
            return str;
        } catch (Exception e) {
            System.out.println("Error in Type Input input. Re-enter ");
            java.lang.String str = getCateg();
            return str;
        }
    }
}