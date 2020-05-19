//prints a list of perfect numbers upto 1000
class PerfectNumList {
    public static void main(String args[]) {
        System.out.println("The list of numbers that are perfect numbers between 1 to 1000 is: ");
        for (int i = 1; i <= 1000; i++) {
            int s = 0;
            for (int n = 1; n < i; n++) {
                if (i % n == 0)
                    s += n;
            }
            if (s == i)
                System.out.println(i);
        }
    }
}
