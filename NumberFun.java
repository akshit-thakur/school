//class XI prog

class NumberFun {
    public static void main(String args[]) {
        System.out.println("The magic numbers (having eventual sum equal to 1) upto 10,000 are: ");
        int ctr = 0;
        for (int i = 1; i <= 10000; i++) {
            int n = i, d = 0, s = 0;
            while (n > 0) {
                d = n % 10;
                s += d;
                n /= 10;
            }
            while (s > 9) {
                int t = s;
                s = 0;
                while (t > 0) {
                    d = t % 10;
                    s += d;
                    t /= 10;
                }
            }
            if (s == 1) {
                ctr++;
                if (ctr % 100 == 0)
                    System.out.println(i + ",");
                else if (i == 10000 && s == 1)
                    System.out.print(i);
                else
                    System.out.print(i + ",");
            }
        }
    }
}