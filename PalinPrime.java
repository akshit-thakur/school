class PalinPrime {
    public static int count;
    static boolean palin, prime;
    static PalinPrime obj = new PalinPrime();

    PalinPrime() {
        count = 0;
        palin = false;
        prime = true;
    }

    public static void main(String args[]) {
        System.out.println("The palindrome prime numbers between 11 and 99999 are: ");
        for (int i = 11; i <= 99999; i++) {
            prime = true;
            palin = false;
            boolean flag1 = obj.checkPalin(i);
            boolean flag2 = obj.checkPrime(i);
            if (flag1 && flag2) {
                count++;
                if (count % 10 == 0)
                    System.out.println(i + " ");
                else
                    System.out.print(i + " ");
            }
        }
    }

    boolean checkPalin(int num) {
        int digit, reverse = 0, temp = num;
        while (num > 0) {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        if (temp == reverse)
            palin = true;
        return palin;
    }

    boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
