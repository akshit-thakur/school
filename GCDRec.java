import java.util.*;
class GCDRec{
    int getGCD(int p,int q){
        if(q==0) return p;
        return getGCD(q,p%q);
    }
    public static void main(String args[]){
        try{
            GCDRec obj=new GCDRec();
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the numbers ");
            int a=read.nextInt();
            int b=read.nextInt();
            System.out.println("The GCD of "+a+" and "+b+" is: "+obj.getGCD(a,b));
        }
        catch(InputMismatchException e){
            System.out.println("Error!");
        }
    }
}