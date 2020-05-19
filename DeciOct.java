//last program of +2,uses recursion
import java.util.*;
class DeciOct{
    int n;
    long  oct;
    DeciOct(){
        n=0; oct=0;
    }
    void getnum(int nn){
        n=nn;
    }
    void getOct(){        
        oct=convert(n);
    }
    long convert(int n){
        if(n==0) return 0;
        return convert(n/8)*10+(n%8);
    }
    void display(){
        System.out.println("The decimal is : "+n);
        getOct();
        System.out.println("The octal is : "+oct);
    }
    public static void main(String args[]){
        try{
            DeciOct obj=new DeciOct();
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the decimal number: ");
            int temp=read.nextInt();
            obj.getnum(temp);            
            obj.display();
        }
        catch(InputMismatchException e){
        
        }   
    }
}