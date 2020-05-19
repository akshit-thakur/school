import java.io.*;
class Combination{
    int n,k,combo;   
    Combination(){
        n=0;
        k=0;
        combo=0;
    }
    void read()throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n:");
        n=Integer.parseInt(input.readLine());
        System.out.print("Enter k:");
        k=Integer.parseInt(input.readLine());
    }
    int fact(int x){
        if(x<2)
        return 1;
        else
        return x*fact(x-1);
    }
    void compute(){
        combo=(fact(n)/(fact(k)*fact(n-k)));
    }
    void display(){
        System.out.println("C("+n+","+k+") is:"+combo);        
    }
    public static void main(String args[])throws IOException{
        Combination obj=new Combination();
        obj.read();
        obj.compute();
        obj.display();
    }
}  