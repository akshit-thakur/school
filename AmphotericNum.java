import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AmphotericNum {
    static int num;

    boolean isAmphoteric(int x) { /** to check for amphoteric num */
        int i = 4; /** power to which 10 is raised to check for amphoteric */
        if (x < 10)
            i = 1;
        else if (x > 10 && x < 100)
            i = 2;
        else if (x > 100 && x < 1000)
            i = 3;
        if (((x * x) % ((int) (Math.pow(10, i)))) == x) /** ((square)%10^i)==x */
            return true;
        return false;
    }

    public static void main(String args[]) throws IOException {
        AmphotericNum obj = new AmphotericNum();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number(Max allowed is 999)");
        num = Integer.parseInt(input.readLine());
        if (num > 999)
            System.out.println("Not in range!");
        else {
            if (obj.isAmphoteric(num))
                System.out.println(num + " is an amphoteric number.");
            else
                System.out.println(num + " is not an amphoteric number.");
        }
    }
}