class FnCalculation {
    public static void main(String args[]) {
        System.out.println("For the function f(x)=((x^2)+1.5x+5)/x-3");
        for (int x = -10; x <= 10; x += 2) {
            float nmr = (float) ((x * x) + (1.5 * x) + 5);
            float dmr = (float) x - 3;
            float term = nmr / dmr;
            System.out.println("For x= " + x + " term is " + term);
        }
    }
}