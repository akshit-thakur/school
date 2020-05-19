class PrimeNumList {
    public static void main(String args[]) {
        System.out.println("The prime numbers between 1 to 100 are :");
        for (int n = 2; n <= 100; n++) {
            int flag = 0;
            for (int x = 2; x < n; x++) {
                if (n % x == 0)
                    flag = 1;
            }
            if (flag == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
