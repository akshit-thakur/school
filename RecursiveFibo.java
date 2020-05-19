class RecursiveFibo {
    int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else if (n > 2)
            return fibo(n - 1) + fibo(n - 2);
        else
            return -1;
    }

    public static void main(String args[]) {
        System.out.println("The fibonacci series till 10 numbers: ");
        RecursiveFibo obj = new RecursiveFibo();
        int i = 0;
        while (i < 10) {
            System.out.println(obj.fibo(i));
            i++;
        }
    }
}