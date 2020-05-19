//insert error
import java.io.*;
class Rearrange{
    int a[];
    int n,pos1=0,pos2=0,item;
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    void enter()throws IOException{
        System.out.println("How many elements?");
        n=Integer.parseInt(input.readLine());
        a=new int[n];
        System.out.println("Enter "+n+" elements.");
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(input.readLine());
        System.out.println("The array is: ");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
    void insert()throws IOException{
        System.out.println("Enter the element to be inserted: ");
        item=Integer.parseInt(input.readLine());
        System.out.println("Enter the position at which to be inserted: ");
        pos1=Integer.parseInt(input.readLine());
        int i=n-1;
        while(i>=0){
            if(i==pos1-1)
            break;
            a[i]=a[i-1];
            i--;
        }
        a[pos1-1]=item;
    }
    void disp1(){
        System.out.println(item+" was inserted successfully at "+pos1);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
    void remov()throws IOException{
        System.out.println("Enter the element to be deleted: ");
        item=Integer.parseInt(input.readLine());
        System.out.println("Enter the position at which to be deleted: ");
        pos2=Integer.parseInt(input.readLine());
        for(int i=0;i<n;i++){
            if(a[i]==item){
                while(i<n-1){
                    a[i]=a[i+1];
                    i++;
                }
            }          
        }        
    }
    void disp2(){
        System.out.println(item+" was deleted successfully at "+pos2+"\nNew array is");
        for(int i=0;i<n-1;i++)
        System.out.print(a[i]+" ");
    }
    public static void main(String args[])throws IOException{
        Rearrange obj=new Rearrange();
        obj.enter();
        obj.remov();
        obj.disp2();
        obj.insert();
        obj.disp1();       
    }
}