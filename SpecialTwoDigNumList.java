class SpecialTwoDigNumList {
    public static void main(String args[]) {
        System.out.println("The special two digits number are: ");
        for (int i = 10; i < 100; i++) {
            int n = i, p = 1, s = 0, sum = 0, d;
            while (n > 0) {
                d = n % 10;
                s += d;
                p *= d;
                n /= 10;
            }
            sum = s + p;
            if (sum == i)
                System.out.println(i);
        }
    }
}