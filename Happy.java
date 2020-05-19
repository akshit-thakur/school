
/**todo: use recursion to find sum of square of digits*/
import java.io.*;
import java.util.HashMap;

class Happy {
    int n;

    Happy() {
        n = 0;
    }

    void getnum(int nn) {
        n = nn;
    }

    int sum_of_digits(int x) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        System.out.println(hm.get(0));
        int m = x, d = 0, s = 0;
        while (m > 0) {
            d = m % 10;
            s += d * d;
            m /= 10;
        }
        while (s > 9) {
            int t = s;
            s = 0;
            while (t > 0) {
                d = t % 10;
                s += d * d;
                t /= 10;
            }
        }
        return s;
    }

    void isHappy() {
        int check = sum_of_digits(n);
        if (check == 1)
            System.out.println("The number is a happy number!");
        else
            System.out.println("The number is not a happy number!");
    }

    public static void main(String args[]) {
        int nn = 0;
        Happy obj = new Happy();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number: ");
            nn = Integer.parseInt(input.readLine());
        } catch (Exception e) {
            System.out.println("Error! Taking default value 28........");
            nn = 28;
        } finally {
            obj.getnum(nn);
            obj.isHappy();
        }
    }
}