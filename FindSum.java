import java.util.*;
class FindSum{
    int m; //the number from which the program will start and stop when sum of digits=n
    int n; //the required sum of digits
    String str;
    FindSum(){
        m=0;
        n=0;
        str="";
    }
    void getInput(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the base number: ");
            m=read.nextInt();
            if(m<100||m>10000){
                System.out.println("The number should be >100 and <10,000. Try again");
                getInput();
            }
            System.out.println("Enter the required sum of digits:");
            n=read.nextInt();
            if(n>m){
                System.out.println("Sum of digits can't be greater than base number! Try again");
                getInput();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Wrong Format type! Re enter values");
            getInput();
        }
    }
    int getDigitSum(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        return sum;
    }
    void findExistence(){
        while(m<10000){
            int sum=getDigitSum(m);
            if(found(sum))
            break;
            m++;
        }        
    }
    boolean found(int s){
        if(s==n){
            str=String.valueOf(m);
            return true;
        }   
        return false;
    }
    void display(){
        if(m!=9999) //i.e. findExistence() loop breaks
        System.out.println("The required number is= "+str+"\nTotal number of digits= "+str.length());
        else
        System.out.println("Null");
    }        
    public static void main(String args[]){
        FindSum obj=new FindSum();
        obj.getInput();
        obj.findExistence();
        obj.display();
    }
}