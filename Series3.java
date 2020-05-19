class Series3 {
    public static void main(String args[]) {
        int n = 10, count = 0;
        float sum = 1.0f, x = 1.0f; // count is to print term number..ctr is to
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i != 1) {
                count++;
                float nmr = (float) Math.pow(x, i);
                float dmr = 0.0f;
                int fact = 1;
                for (int j = 1; j <= i; j++)
                    dmr = fact * j;
                float term = nmr / dmr;
                if (count % 2 == 0)
                    sum += term;
                else
                    sum -= term;
                System.out.println("Term no. " + count + " is :" + term);
            }
        }
        System.out.println("The sum of the series 1-x^2/2!+x^4/4!-x^6/4!....x^n/n! is: ");
        System.out.println(sum);
    }
}
