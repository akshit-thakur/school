class Restraunt {
    public static void main(String args[]) {
        java.lang.String a = "Welcome to the restraunt", b = "The Menu", c = "Item     Price", d = "Pizza", e = "Burger",
                f = "Cold Drink", Selection1 = "Burger", Selection2 = "Burger";
        int g = 75, h = 50, i = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d + "      " + g);
        System.out.println(e + "     " + h);
        System.out.println(f + " " + i);
        switch (Selection1) {
        case "Pizza":
            System.out.println("You have selected Pizza");
            break;
        case "Burger":
            System.out.println("You have selected Burger");
            break;
        case "Cold Drink":
            System.out.println("You have selected Cold Drink");
            break;
        default:
            System.out.println("Item not in menu");
        }
        switch (Selection2) {
        case "Pizza":
            System.out.println("You have selected Pizza");
            break;
        case "Burger":
            System.out.println("You have selected Burger");
            break;
        case "Cold Drink":
            System.out.println("You have selected Cold Drink");
            break;
        default:
            System.out.println("Item not in menu");
        }
        if (Selection1 == "Pizza" && Selection2 == "Burger")
            System.out.println("Your total bill : " + (g + h));
        else if (Selection1 == "Pizza" && Selection2 == "Cold Drink")
            System.out.println("Your total bill : " + (g + i));
        else if (Selection1 == "Burger" && Selection2 == "Pizza")
            System.out.println("Your total bill : " + (h + g));
        else if (Selection1 == "Burger" && Selection2 == "Cold Drink")
            System.out.println("Your total bill : " + (h + i));
        else if (Selection1 == "Cold Drink" && Selection2 == "Pizza")
            System.out.println("Your total bill : " + (i + g));
        else if (Selection1 == "Cold Drink" && Selection2 == "Burger")
            System.out.println("Your total bill : " + (i + h));
        else if (Selection1 == "Pizza" && Selection2 == "Pizza")
            System.out.println("Your total bill : " + (g + g));
        else if (Selection1 == "Burger" && Selection2 == "Burger")
            System.out.println("Your total bill : " + (h + h));
        else
            System.out.println("Your total bill : " + (i + i));
        System.out.println("Thank you,Please come again!");
    }
}