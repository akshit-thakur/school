class FactorialList {
    public static void main(String args[]) {
        for (int i = 1; i <= 30; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++)
                fact *= j;
            System.out.println("The factorial of " + i + " is " + fact);
        }
    }
}