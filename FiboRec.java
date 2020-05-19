class FiboRec {
    public static void main(String args[]) {
        int i = 1, term;
        FiboRec obj = new FiboRec();
        for (; i <= 10; i++) {
            term = obj.fibo(i);
            System.out.println(term);
        }
    }

    int fibo(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else if (n > 2)
            return fibo(n - 1) + fibo(n - 2);
        else
            return -1;
    }
}