import java.util.*;
public class Record{
    String[] names;
    int[] rank;
    Record(){
        names=new String[5];
        rank=new int[5];
    }
    void readValues(){
        Scanner read=new Scanner(System.in);
        try{
            for(int i=0;i<5;i++){
                System.out.println("Name of student: "+(i+1));
                names[i]=read.next();
                System.out.println("Rank of student: "+(i+1));
                rank[i]=read.nextInt();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error!");            
        }
    }
    void display(){
        for(int i=0;i<5;i++)
        System.out.println("Name "+names[i]+" Rank :"+rank[i]);
    }   
    public static void main(String args[]){        
        Rank obj1=new Rank();
        obj1.highest();
        obj1.display();
    } 
}
class Rank extends Record{
    int index;
    Rank(){
        super();
        index=0;
        readValues();
    }
    void highest(){
        int max=rank[0]; index=0;
        for(int i=1;i<5;i++){
            if(max<rank[i])
            index=i;
        }
    }
    void display(){
        super.display();
        System.out.println("Name of top ranker is : "+names[index]);
    }
}
