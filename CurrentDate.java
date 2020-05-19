import java.util.Calendar;

class CurrentDate {
    public static void main(String args[]) {
        Calendar obj = Calendar.getInstance();
        System.out.println("Today is: " + (obj.get(Calendar.DATE)) + "/" + (obj.get(Calendar.MONTH) + 1) + "/"
                + obj.get(Calendar.YEAR));
    }
}