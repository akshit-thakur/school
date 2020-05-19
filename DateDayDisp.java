import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DateDayDisp {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter the date in dd/mm/yyyy format: ");
        java.lang.String date = input.readLine();
        int len = date.length();
        int YrIndex = date.lastIndexOf('/');
        int MonthIndex = date.indexOf('/');
        int dt = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring((MonthIndex + 1), YrIndex));
        int year = Integer.parseInt(date.substring((YrIndex + 1), len));
        System.out.println("Enter the day on first of January : ");
        java.lang.String Jan = input.readLine();
        int daysAdd = 0, first, result = 0;
        if (year % 4 == 0) {
            daysAdd = findLeap(dt, month);
        } else {
            daysAdd = findNormal(dt, month);
        }
        switch (Jan) {
        case "Monday":
            first = 0;
            result = first + daysAdd;
            getDay(result);
            break;
        case "Tuesday":
            first = 1;
            result = first + daysAdd;
            getDay(result);
            break;
        case "Wednesday":
            first = 2;
            result = first + daysAdd;
            getDay(result);
            break;
        case "Thursday":
            first = 3;
            result = first + daysAdd;
            getDay(result);
            break;
        case "Friday":
            first = 4;
            result = first + daysAdd;
            getDay(result);
            break;
        case "Saturday":
            first = 5;
            result = first + daysAdd;
            getDay(result);
            break;
        case "Sunday":
            first = 6;
            result = first + daysAdd;
            getDay(result);
            break;
        default:
            System.out.println("Invalid .");
        }

    }

    public static int findLeap(int date, int month) {
        int start = 0;
        switch (month) {
        case 1:
            start = 0;
            break;
        case 2:
            start = 31;
            break;
        case 3:
            start = 60;
            break;
        case 4:
            start = 91;
            break;
        case 5:
            start = 121;
            break;
        case 6:
            start = 152;
            break;
        case 7:
            start = 182;
            break;
        case 8:
            start = 213;
            break;
        case 9:
            start = 244;
            break;
        case 10:
            start = 274;
            break;
        case 11:
            start = 305;
            break;
        case 12:
            start = 335;
            break;
        default:
            System.out.println("Invalid Month.");
        }
        int day = (start + date) % 7;
        if (day > 7) {
            day %= 7;
        }
        return day;
    }

    public static int findNormal(int date, int month) {
        int start = 0;
        switch (month) {
        case 1:
            start = 0;
            break;
        case 2:
            start = 31;
            break;
        case 3:
            start = 59;
            break;
        case 4:
            start = 90;
            break;
        case 5:
            start = 120;
            break;
        case 6:
            start = 151;
            break;
        case 7:
            start = 181;
            break;
        case 8:
            start = 212;
            break;
        case 9:
            start = 243;
            break;
        case 10:
            start = 273;
            break;
        case 11:
            start = 304;
            break;
        case 12:
            start = 334;
            break;
        default:
            System.out.println("Invalid Month.");
        }
        int day = (start + date) % 7;
        if (day >= 7) {
            day %= 7;
        }
        return day;
    }

    public static void getDay(int date) {
        switch (date) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid Input");
        }
    }
}
