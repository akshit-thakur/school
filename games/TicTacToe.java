/**
   *v1.0 (bug found:- Drawn game continues. Fixed 02-04-2015)
    started 30-3-15
    Get better game win conditions. Dated 31-3-15
    Finished 01-04-2015
   * v1.0.1 
     update will be loop and the count of games won
     done 02-04-2015
   * v1.0.2
     exception handling improved. Game crashes because otherwise also the game crashes!
     done 5-4-15
   * v1.0.3
     No game crash! starter() included.
     done 6-4-15
   * v1.0.4
     option included to restart the game before quitting.
   * v1.0.5(unreleased)
     getInput(int,int,int,int) changed to play()
   *v1.1 improvements should be AI
*/
import java.util.*;
class TicTacToe{ 
    Scanner read=new Scanner(System.in);     
    int games,n,score1,score2,count; String p1,p2;
    private String arr[][]=new String[3][3];
    TicTacToe(){
        p1=""; p2=""; games=0; n=0; score1=0; score2=0; count=0;
    }
    void dispRef(){
        int arr[][]=new int[3][3];        int n=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=n;  
                n+=1;
            }
        }
        for(int i=0;i<3;i++){
            if(i!=2){
                System.out.println("\t\t\t"+arr[i][0]+" | "+arr[i][1]+" | "+arr[i][2]);
                System.out.println("\t\t\t----------");
            }
            else
            System.out.println("\t\t\t"+arr[i][0]+" | "+arr[i][1]+" | "+arr[i][2]);
        }
    }
    void dispGame(){
        for(int i=0;i<3;i++){
            if(i!=2){
                System.out.println("\t\t\t"+arr[i][0]+" | "+arr[i][1]+" | "+arr[i][2]);
                System.out.println("\t\t\t----------");
            }
            else
            System.out.println("\t\t\t"+arr[i][0]+" | "+arr[i][1]+" | "+arr[i][2]);
        }
    }
    boolean isEmpty(int location){  
        if(location!=-1)        return arr[location/10][location%10].equals(" ");        else         return false;
    }
    boolean isDraw(){      
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j].equals(" "))
                return false;                
            }
        }
        return true;
    }
    String checkWin(String input,String p1,String p2){
        if(arr[0][0].equals(arr[1][0])&&arr[1][0].equals(arr[2][0])&&arr[2][0].equals(input))        return (input.equals("X"))?p1:p2;
        else if(arr[0][1].equals(arr[1][1])&&arr[1][1].equals(arr[2][1])&&arr[2][1].equals(input))   return (input.equals("X"))?p1:p2;
        else if(arr[0][2].equals(arr[1][2])&&arr[1][2].equals(arr[2][2])&&arr[2][2].equals(input))   return (input.equals("X"))?p1:p2;
        else if(arr[0][0].equals(arr[1][0])&&arr[0][1].equals(arr[0][2])&&arr[0][2].equals(input))   return (input.equals("X"))?p1:p2;
        else if(arr[1][0].equals(arr[1][1])&&arr[1][1].equals(arr[1][2])&&arr[1][2].equals(input))   return (input.equals("X"))?p1:p2;
        else if(arr[2][0].equals(arr[2][1])&&arr[2][1].equals(arr[2][2])&&arr[2][2].equals(input))   return (input.equals("X"))?p1:p2;
        else if(arr[0][0].equals(arr[1][1])&&arr[1][1].equals(arr[2][2])&&arr[2][2].equals(input))   return (input.equals("X"))?p1:p2;
        else if(arr[0][2].equals(arr[1][1])&&arr[1][1].equals(arr[2][0])&&arr[2][0].equals(input))   return (input.equals("X"))?p1:p2;                            
        return " ";
    }    
    void emptyBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            arr[i][j]=" ";  
        }
    }
    void dispScore(int score1,int score2){
        System.out.println("Out of the non-tied games the results are: ");
        System.out.println(p1+" won "+score1+" games.");
        System.out.println(p2+" won "+score2+" games.");
    }
    void play(){
        try{
            int location=-1; String winner=" ";
            if(isDraw()){
                System.out.println("The game is drawn.");
                count++;
                if(count<=games){
                    System.out.println("Next Game.");
                    n++;
                    emptyBoard();
                    play();
                }
            }
            else{
                if(n%2==0)
                System.out.println("Your turn, "+p1+". Where to put the X? Enter 0 or number >9 to exit");
                else
                System.out.println("Your turn, "+p2+". Where to put the O? Enter 0 or number >9 to exit");
                int choice=read.nextInt();
                if(choice==0||choice>9){
                    System.out.println("See you soon.");
                    System.exit(0);
                }
                else{
                    String input=(n%2==0)?"X":"O"; // whether X or O
                    location=getLocation(choice);                    
                    if(isEmpty(location)){
                        arr[location/10][location%10]=input;
                        dispGame();
                        winner=checkWin(input,p1,p2); 
                        if(winner.equals(" ")){
                            n++;
                            play();
                        }
                        else{
                            System.out.println(winner+" won this game");
                            if(winner.equals(p1))
                            score1++;
                            else
                            score2++;
                            count++;
                            if(count<=games){
                                System.out.println("Next Game.");
                                emptyBoard();
                                play();
                            }
                            else{
                                dispScore(score1,score2);
                                System.out.println("Thank you for playing.\nEnter y to quit or any other key to play again");
                                char go=read.next().charAt(0);
                                if(Character.toUpperCase(go)=='Y') System.exit(0);
                                else   starter();
                            }
                        }
                    }
                    else{
                        System.out.println("That box is already taken."); 
                        play();
                    }
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input,try again.");
            play();
        }        
    }
    int getLocation(int choice){
        switch(choice){
            case 1: return 00;
            case 2: return 01;
            case 3: return 02;
            case 4: return 10;
            case 5: return 11;
            case 6: return 12;                      
            case 7: return 20;                        
            case 8: return 21;                       
            case 9: return 22;
        }return -1;
    }
    void starter(){
        int games; String p1,p2;
        try{
            System.out.print("Enter name,Player 1: ");
            p1=read.nextLine();
            System.out.print("Enter name,Player 2: ");
            p2=read.nextLine();    
            System.out.print("How many games do you want to play? ");
            games=read.nextInt();
            while(games<=0){
                System.out.println("Games can't be less than or equal to zero.");
                games=read.nextInt();                
            }
            System.out.println("Welcome to the game of TicTacToe.");
            dispRef(); 
            System.out.println("Memorise the box numbers,I'll ask you the box number where you want the X/O");
            emptyBoard();           
            play();           
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
            starter();
        }
    }
    public static void main(String args[]){  
        TicTacToe call=new TicTacToe();   
        call.starter();
    }    
}