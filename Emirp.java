//not ending****
import java.util.*;
class Emirp{
    int n;
    int rev;
    Emirp(int nn){
        n=nn;
        rev=0;
    }
    boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0) 
            return false;
        }
        return true;
    }
    boolean isEmirp(){
        while(n>0){
            int digit=n%10;            
            rev=(rev*10)+digit;
            n/=10;
        }                
        return isPrime(rev);
    }
    void display(){
        System.out.print(n+" and its reverse ");
        if(isPrime(n)&&isEmirp())
        System.out.print(rev+" are prime numbers. Hence it is Emirp\n");
        else if(isPrime(n)||isEmirp())
        System.out.print(rev+" are not collectively prime. Hence it is not Emirp");
        else
        System.out.print(rev+" are not prime. Hence it is not Emirp");
    }
    public static void main(String args[]){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter a number: ");
            int x=read.nextInt();
            Emirp obj=new Emirp(x);
            obj.display();
        }
        catch(InputMismatchException e){
            System.out.println("Error in input!");
        }
    }
}