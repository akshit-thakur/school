/**function details: checkers are boolean,others are void.
 * getInput() stores uboyt in dd mm yyyy format
 * display() displays validity if all values are correct
 * checkDay() checks if the day entered is valid wrt month entered.
 * checkMonth() checks if month number is out of range.
 * isFeb() checks if current month is feb when dealing with leap year.
 * is30DayMonth() checks if the day number limit matches the month number.
 * is31DayMonth() checks if the day number limit matches the month number.
 * checkYear() checks if yyyy format isn't voilated. i.e. if year is <=0 or >9999
 * checkLeapYear() checks if the year is leap year. */
import java.util.*;
class DateOfBirth{
    int day,month,year; /*stores the date in dd mm yyyy format*/ int len=(Integer.toString(year)).length(); //stores the number of digits in year input
    public static void main(String args[]){  
        DateOfBirth obj=new DateOfBirth();        obj.getInput();        obj.display(); 
    }
    void getInput(){
        try{
            System.out.println("Enter date of birth in dd mm yyyy format");
            Scanner read=new Scanner(System.in);
            day=read.nextInt();            month=read.nextInt();            year=read.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input."); getInput();
        }
    }    
    void display(){
        System.out.print(day+"/"+month+"/"+year+" is: ");
        if(checkDay()&&checkMonth()&&checkYear())        System.out.println("Valid");
        else        System.out.println("Invalid");
    }
    boolean checkDay(){
        if(day<1||day>31)        return false;
        if(day<=30&&(is30DayMonth()))        return true;
        if (day<=31&&(is31DayMonth()))        return true;
        if(day<=29&&(checkLeapYear())&&(isFeb()))        return true;
        else        return false;        
    }   
    boolean checkMonth(){
        return (month<1||month>12)?false:true;
    }
    boolean isFeb(){
        return month==2?true:false;
    }    
    boolean is30DayMonth(){
        switch(month){
            case 4:               case 6:            case 9:       case 11: return true; default: return false;            /**if any condition is satisfied,returns true else false*/
        }        
    }
    boolean is31DayMonth(){
        switch(month){ /**if any condition is satisfied,returns true else false*/
            case 1:               case 3:                    case 5:            case 7:          case 8:         case 10:       case 12:return true; default: return false;  
        }        
    }
    boolean checkYear(){ 
        return (len>4||len<1)?false:true;        
    }
    boolean checkLeapYear(){
        return (year%4==0)?true:false;
    }    
}