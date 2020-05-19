import java.util.*;
class Denominations{
    int money;   /*stores amount in int*/
    String worded; /*stores money in string format*/   
    String[] inWords; /*array to store digits in words*/
    int count1k;    int count5h;    int count1h;    int count50;    int count20;    int count10;    int count5;    int count2;    int count1;    int totalNotes; /*respective counts*/
    Denominations(){
        money=0;   worded="";  count1k=0;   count5h=0;   count1h=0;  count50=0;  count20=0;   count10=0;  count5=0; count2=0;  count1=0;  totalNotes=0;
    }
    void getInput(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the amount in Rs.");
            money=read.nextInt();
            if(money>99999){
                System.out.println("Can not accept more than 5 digits! Try again.");
                getInput();
            }
            worded=String.valueOf(money);
            inWords=new String[worded.length()];
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input! Try again");
            getInput();
        }
    }
    void fillInWords(){ /**fills up the array with help of getWords(char)*/
        for(int i=0;i<worded.length();i++)
        inWords[i]=getWords(worded.charAt(i));
    }   
    String getWords(char ch){
        switch(ch){
            case '0': return "ZERO";
            case '1': return "ONE";
            case '2': return "TWO";
            case '3': return "THREE";
            case '4': return "FOUR";
            case '5': return "FIVE";
            case '6': return "SIX";
            case '7': return "SEVEN";
            case '8': return "EIGHT";
            case '9': return "NINE";
            default:  return "error";
        }
    }
    void countNotes(){ /**counts the number of notes of 1000 to 1 and the total notes*/
        count1k=money/1000;        money%=1000;
        count5h=money/500;         money%=500;
        count1h=money/100;         money%=100;        
        count50=money/50;          money%=50;
        count20=money/20;          money%=20;
        count10=money/10;          money%=10;
        count5=money/5;            money%=5;
        count2=money/2;            money%=2;
        count1=money/1;           
        totalNotes=count1k+count5h+count1h+count50+count20+count10+count5+count2+count1;
    }
    void display(){    
        for(int i=0;i<worded.length();i++)
        System.out.print(inWords[i]+" ");
        System.out.println("DENOMINATION: ");
        if(count1k!=0) System.out.println("1000 X "+count1k+"        = "+count1k*1000);
        if(count5h!=0) System.out.println("500  X "+count5h+"        = "+count5h*500);
        if(count1h!=0) System.out.println("100  X "+count1h+"        = "+count1h*100);
        if(count50!=0) System.out.println("50   X "+count50+"        = "+count50*50);
        if(count20!=0) System.out.println("20   X "+count20+"        = "+count20*20);
        if(count10!=0) System.out.println("10   X "+count10+"        = "+count10*10);
        if(count5!=0)  System.out.println("5    X "+count5+"         = "+count5*5);
        if(count2!=0)  System.out.println("2    X "+count2+"         = "+count2*2);
        if(count1!=0)  System.out.println("1    X "+count1+"         = "+count1*1);
                       System.out.println("TOTAL                     = "+worded);
                       System.out.println("TOTAL NUMBER OF NOTES     = "+totalNotes);
    }
    public static void main(String args[]){
        Denominations obj=new Denominations(); 
        obj.getInput();
        obj.fillInWords();
        obj.countNotes();
        obj.display();
    }
}