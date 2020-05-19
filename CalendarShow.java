//todo: handle months;
import java.util.*;
class CalendarShow{
    public static void main(String args[]){
        Calendar c=Calendar.getInstance();
        Scanner read=new Scanner(System.in);
        int date=c.get(Calendar.DATE);
        int month=c.get(Calendar.MONTH)+1;
        int year=c.get(Calendar.YEAR);
        System.out.println("Enter your date of birth in dd mm yyyy");
        int d=read.nextInt();
        int m=read.nextInt();
        int y=read.nextInt();
        System.out.println("Today on "+date+"."+month+"."+year+", your age is :");
        System.out.println(year-(y+1)+" years, "+(month-m)+" months");
        if(d>2); //dummy code to remove error
        read.close();
    }
}
        