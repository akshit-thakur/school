import java.util.Scanner;

class QuadRoot {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c for the equation a(x^2)+bx+c=0: ");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        float D = ((b * b) - (4 * a * c));
        float root1, root2;
        if (D > 0) {
            System.out.println("The roots are real and distinct");
            root1 = (float) ((-b) + (Math.sqrt(D)) / (2 * a));
            root2 = (float) ((-b) - (Math.sqrt(D)) / (2 * a));
            System.out.println("The two roots of the equation are:");
            System.out.println(root1 + " and " + root2);
        } else if (D == 0) {
            System.out.println("The roots are real and equal.");
            root1 = (float) ((-b) + (Math.sqrt(D)) / (2 * a));
            System.out.println("The two roots of the equation are:");
            System.out.println(root1 + " and " + root1);
        } else
            System.out.println("The roots are complex and unequal. No solution");

        read.close();
    }
}