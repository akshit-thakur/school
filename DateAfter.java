import java.util.*;
class DateAfter{
    int dayNum;
    int dayAfter;
    int year;
    void getInput(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the day number: ");
            dayNum=read.nextInt();
            if(dayNum<1||dayNum>366){                System.out.println("Not in range 1 to 366. Try again!");                getInput();            }
            System.out.println("Enter a leap year: ");
            year=read.nextInt();
            if(year%4!=0){                System.out.println("Can't be a non-leap year. Try again");                getInput();            }
            System.out.println("Enter the number of days after the above day number of which you want the date: ");   
            dayAfter=read.nextInt();
            if(dayAfter<1||dayAfter>100){                System.out.println("Enter between 1 and 100. Try again");                getInput();            }
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input format. Enter a number!");            getInput();
        }
    }   
    void dayNumber(int num){
        int d=0;
        if(num<=31){
             d=num;
             if(d>=4&&d<31&&d!=21&&d!=22&&d!=23)    System.out.println(d+"th January "+year);    
             else if(d==1||d==11||d==21||d==31) System.out.println(d+"st January "+year);
             else if(d==2||d==12||d==22) System.out.println(d+"nd January. ");
             else if(d==3||d==13||d==23) System.out.println(d+"rd January "+year);           
        }            
        else if(num>31&&num<=60){
            d=num-31;
            if(d>=4&&d<29&&d!=21&&d!=22&&d!=23)     System.out.println(d+"th February "+year); 
            else if(d==1||d==11||d==21)  System.out.println(d+"st February "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd February "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd February "+year);     
        }
        else if(num>60&&num<=91){
            d=num-60;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th March "+year);
            else if(d==1||d==11||d==21||d==31) System.out.println(d+"st March "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd March "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd March "+year); 
        }
        else if(num>91&&num<=121){
            d=num-91;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23)  System.out.println(d+"th April "+year);
            else if(d==1||d==11||d==21) System.out.println(d+"st April "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd April "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd March "+year); 
        }       
        else if(num>121&&num<=152){
            d=num-121;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23)  System.out.println(d+"th May "+year);
            else if(d==1||d==11||d==21||d==31) System.out.println(d+"st May "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd May "+year);   
            else if(d==3||d==13||d==23) System.out.println(d+"rd May "+year);   
        }
        else if(num>152&&num<=182){
            d=num-152;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th June "+year);
            else if(d==1||d==11||d==21)  System.out.println(d+"st June "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd June "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd June "+year); 
        }
        else if(num>182&&num<=213){
            d=num-182;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th July "+year);
            else if(d==1||d==11||d==21||d==31)  System.out.println(d+"st July "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd July "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd July "+year); 
        }
        else if(num>213&&num<=244){
            d=num-213;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th August "+year);
            else if(d==1||d==11||d==21||d==31)  System.out.println(d+"st August "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd August "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd August "+year); 
        }
        else if(num>244&&num<=274){
            d=num-244;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th September "+year);
            else if(d==1||d==11||d==21)  System.out.println(d+"st September "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd September "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd September "+year); 
        }
        else if(num>274&&num<=305){
            d=num-274;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23)                System.out.println(d+"th October "+year);
            else if(d==1||d==11||d==21||d==31) System.out.println(d+"st October "+year); 
            else if(d==2||d==12||d==22) System.out.println(d+"nd October "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd October "+year);    
        }
        else if(num>305&&num<=335){
            d=num-305;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th November "+year);
            else if(d==1||d==11||d==21)  System.out.println(d+"st November "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd November "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd November "+year); 
        }
        else if(num>335&&num<=366){
            d=num-335; 
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th December "+year);
            else if(d==1||d==11||d==21||d==31) System.out.println(d+"st December "+year); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd December "+year); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd December "+year);  
        }
        else if(num>366&&num<=397){
            d=num-366;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23)    System.out.println(d+"th January "+(year+1)); 
            else if(d==1||d==11||d==21||d==31) System.out.println(d+"st January "+(year+1));
            else if(d==2||d==12||d==22) System.out.println(d+"nd January "+(year+1));
            else if(d==3||d==13||d==23) System.out.println(d+"rd January "+(year+1));
        }
        else if(num>397&&num<=425){
            d=num-397;
            if(d>=4&&d<28&&d!=21&&d!=22&&d!=23)     System.out.println(d+"th February "+(year+1)); 
            else if(d==1||d==11|d==21)  System.out.println(d+"st February "+(year+1)); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd February "+(year+1)); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd February "+(year+1));     
        }
        else if(num>425&&num<=456){
            d=num-425;
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23) System.out.println(d+"th March "+(year+1));
            else if(d==1||d==11||d==21||d==31) System.out.println(d+"st March "+(year+1)); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd March "+(year+1)); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd March "+(year+1)); 
        }
        else if(num>456&&num<=466){
            d=num-456; 
            if(d>=4&&d<31&&d!=21&&d!=22&&d!=23)  System.out.println(d+"th April "+(year+1));
            else if(d==1||d==11||d==21) System.out.println(d+"st April "+(year+1)); 
            else if(d==2||d==12||d==22)  System.out.println(d+"nd April "+(year+1)); 
            else if(d==3||d==13||d==23)  System.out.println(d+"rd March "+(year+1)); 
        }
    }
    void display(){
        dayNumber(dayNum);
        dayNum+=dayAfter;
        System.out.println("Day after "+dayAfter+" days: ");
        dayNumber(dayNum);
    }
    public static void main(String args[]){
        DateAfter obj=new DateAfter();
        obj.getInput();      
        obj.display();
    }    
}