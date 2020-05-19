/**class PERSONAL
 * String Name Stores name of employee
 * String Pan stores the PAN number
 * int basic_pay stores the basic of employee
 * long acc_no stores the bank a/c number.
 **class RETIRE extends PERSONAL
 * int yrs stores the years of service
 * double pf stores provident fund amt(in decimals)
 * double grat stores the employee gratuity amt(in decimals)
 */
import java.util.*;
public class Personal{
    String name,pan; int basic_pay; long acc_no;
    Personal(){ //default constructor called in sub class
        name="";        pan="";        basic_pay=0;        acc_no=0;
    }
    void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee PAN number: "+pan);
        System.out.println("Employee basic pay: "+basic_pay);
        System.out.println("Employee Bank Account Number: "+acc_no);        
    }
    public static void main(String args[]){
        Retire obj=new Retire();
        obj.provident();
        obj.gratuity();
        obj.display();
    }    
}
class Retire extends Personal{
    int yrs; double grat,pf;
    Retire(){
        super();
        yrs=0;pf=0.0;grat=0;
        readValues(); //initiliazes all the required variables        
    }
    void provident(){
        pf=((0.02*basic_pay)*yrs);
    }
    void gratuity(){
        grat=(yrs>=10)?12*basic_pay:0.0;       
    }
    void readValues(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter Employee Name");
            name=read.next();
            System.out.println("Enter PAN nubmer: ");
            pan=read.next();
            System.out.println("Enter basic pay in numbers: ");
            basic_pay=read.nextInt();
            System.out.println("Enter bank account number");
            acc_no=read.nextLong();
            System.out.println("Enter years of service");
            yrs=read.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error,try again");
            readValues();
        }
    }
    void display(){
        super.display();
        System.out.println("PF(Provident Fund: "+pf);
        System.out.println("Gratuity amount: "+grat);
    }
}