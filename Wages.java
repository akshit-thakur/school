import java.util.*;
class Worker{
    String name; double basic; 
    Worker(String nm,double bas){
        name=nm;
        basic=bas;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Basic: "+basic);
    }
}
public class Wages extends Worker{
    int hrs; double rate,wages;
    Wages(String nm,double bas,int hr,double rt){
        super(nm,bas);
        hrs=hr;
        rate=rt;
    }
    double overtime(){ //to calculate income from overtime
        return hrs*rate;
    }
    void display(){
        super.display();
        wages=overtime()+basic;
        System.out.println("Hours worked: "+hrs);
        System.out.println("Rate: "+rate);
        System.out.println("Wage: "+wages);
    }
    public static void main(String args[]){
        try{
            Scanner read=new Scanner(System.in); 
            System.out.println("Enter name of worker: ");       String n=read.nextLine();       
            System.out.println("Enter basic pay: ");            double bp=read.nextDouble();
            System.out.println("Enter hours worked: ");         int hr=read.nextInt();
            System.out.println("Enter the rate :");             double r=read.nextDouble();
            Wages obj=new Wages(n,bp,hr,r);
            obj.display();
        }
        catch(Exception e){
        }
    }
}