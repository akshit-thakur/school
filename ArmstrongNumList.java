class ArmstrongNumList {
    public static void main(String args[]) {
        System.out.println("The armstong numbers between 1 to 1000 are: ");
        for (int i = 1; i <= 1000; i++) {
            int n = i, s = 0;
            while (n > 0) {
                int d = n % 10;
                s += (Math.pow(d, 3));
                n /= 10;
            }
            if (s == i)
                System.out.println(i);
        }
    }
}
