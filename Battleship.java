import java.util.InputMismatchException;
import java.util.Scanner;
class Battleship{
    public static void main(String args[]){
        Battleship obj=new Battleship();
        obj.starter();
    }
    void starter(){
        try{
            Scanner read=new Scanner(System.in);
            read.close();
        }
        catch(InputMismatchException e){
            System.out.println("Error in input.");
            starter();
        }
    }
}