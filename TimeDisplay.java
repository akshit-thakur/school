import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TimeDisplay {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter hours:");
        int h = Integer.parseInt(input.readLine());
        System.out.println("Enter minutes:");
        int m = Integer.parseInt(input.readLine());
        if (h > 12 && h != 0)
            System.out.println("Invalid input of hours.");
        else if (m > 60)
            System.out.println("Invalid input of minutes.");
        else {
            if (m > 30 && m != 45 && m != 60) {
                if (h != 12)
                    h += 1;
                else
                    h = 1;
                m = 60 - m;
                System.out.println(m + " minutes to " + h);
            } else if (m < 30 && m != 15 && m != 0)
                System.out.println(m + " minutes past " + h);
            else {
                switch (m) {
                case 0:
                    System.out.println(h + " o' clock.");
                    break;
                case 15:
                    System.out.println("Quarter past " + h);
                    break;
                case 30:
                    System.out.println("Half Past " + h);
                    break;
                case 45:
                    if (h == 12)
                        System.out.println("Quarter to 1 ");
                    else {
                        h += 1;
                        System.out.println("Quarter to " + h);
                    }
                    break;
                case 60:
                    if (h == 12)
                        System.out.println("1 o' clock");
                    else {
                        h += 1;
                        System.out.println(h + " o' clock.");
                    }
                    break;
                default:
                    ;
                }
            }
        }
    }
}