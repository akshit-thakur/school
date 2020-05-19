import java.util.*;
class Battleship{
    public static void main(String args[]){
        Battleship call=new Battleship();
        call.starter();
    }
    void starter(){
        try{
            Scanner read=new Scanner(System.in);
        }
        catch(InputMismatchException e){
            System.out.println("Error in input.");
            starter();
        }
    }
}