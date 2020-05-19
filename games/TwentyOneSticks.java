/** min 1 stick max 4 sticks, the one to pick 21st stick is winner, can be single and multiplayer too!
   * errror in getMode(); and multiPlay(); doesn't stop. Dated 23-02-15
   * Plans change. Only double player to be released for now. 21st stick picker isn't the winner,game continues after first end if 21 stick limit exceeds. Dated 07-04-2015
   * v1.0 
      * multiPlay() completed with success. Dt 14-12-15
      * Left Things: getMode(),singlePlay()
      * in decideWin(), game restarts
   * v1.0.1
      *
     */
import java.util.*;
class TwentyOneSticks{
    static Scanner read=new Scanner(System.in);    int num=0,sticks,last=0;   char go; 
    public static void main(String args[]){
        TwentyOneSticks call=new TwentyOneSticks();        
        call.starter();
    }        
    void starter(){        
        rules();     sticks=0;
        System.out.println("Enter y if ready,any other letter to exit.");        go=read.next().charAt(0);
        if(!(Character.toUpperCase(go)=='Y')){
            System.out.println("See you soon.");
            System.exit(0);
        }
        else{
            System.out.println("Enter 1 for single player,2 for multiplayer game: ");
            int mode=read.nextInt();
            while(mode!=1&&mode!=2){
                 System.out.println("Choose correct mode, 1 for single player,2 for multiplayer");
                 mode=read.nextInt();
            }
            if(mode==1);
            //singlePlay();
            else
            multiPlay(); 
        } 
    }    
    void rules(){
        System.out.println("Welcome to 21 Sticks.\nInstructions for playing the game");
        System.out.println("1. There will be 21 sticks, Player 1(in multiplay) and Player(in single play) has to start the game. ");
        System.out.println("2. The user can take maximum of four sticks and minimum of one stick at a time.");
        System.out.println("3. The player who takes the 21st stick will be the winner of the game.");
        System.out.println("4. For every time the player/computer takes the number of sticks, it will be displayed on the screen.");
    }
    void multiPlay(){
         if(sticks<21){
             try{
                 if(num%2==0)
                 System.out.println("Enter the number of sticks you want to pick or press 0 to exit,Player 1");
                 else
                 System.out.println("Enter the number of sticks you want to pick or press 0 to exit,Player 2");
                 int n=read.nextInt();
                 if(n==0){
                     System.out.println("See you soon");
                     System.exit(0);
                 }
                 else if(n<1||n>4){
                     while(n<1||n>4){
                         System.out.println("Please enter a value between 1 and 4 only.");
                         n=read.nextInt();
                     }
                 }
                 if(sticks+n>21){
                     System.out.println("Limit of 21 sticks exceeded.");                         multiPlay();
                 }
                 else{
                     sticks+=n;     
                     if(sticks>=20&&num%2==0)                         last=1; 
                     else if(sticks>=20&&num%2!=0)                    last=2; 
                     if(num%2==0)                         System.out.println("Player 1 picked "+n+" sticks "); 
                     else                                 System.out.println("Player 2 picked "+n+" sticks ");
                     num+=1;
                     if(sticks==21)
                     decideWin();   
                 }
                 multiPlay();
             }
             catch(InputMismatchException e){
                 System.out.println("Please enter a value between 1 and 4");
                 multiPlay();
             }
         }
    }
    void decideWin(){
        if(last==1)
        System.out.println("Player 1 won");
        else
        System.out.println("Player 2 won");
        System.out.println("Thank you for playing.\nEnter y to quit or any other key to play again");
        go=read.next().charAt(0);
        if(Character.toUpperCase(go)=='Y')        System.exit(0);
        else                    starter();
    }
    /*void singlePlay(){        
        if(sticks<21){
            try{                
                System.out.println("Enter the number of sticks you want to pick or press 0 to exit,Player 1);                
                int n=read.nextInt();
                if(n==0){
                    System.out.println("See you soon");
                    System.exit(0);         
                }
                else if(n<1||n>4){
                    while(n<1||n>4){
                        System.out.println("Please enter a value between 1 and 4 only.");
                        n=read.nextInt();
                    }
                }
                else{
                     if(sticks+n>21){
                         System.out.println("Limit of 21 sticks exceeded.");                 
                         singlePlay();
                     }
                     else{                         
                            sticks+=n; 
                            if(sticks>=20)                            last=1; 
                            System.out.println("Player 1 picked "+n+" sticks "); 
                            n=getCompSticks(n);
                            System.out.println("Computer picked "+n+" sticks.");
                            sticks+=n;
                            if(sticks>=20)                last=2;   
                     }
                     if(sticks==21){
                         decideWin();
                         sticks=22;  
                     }
                } 
                singlePlay();
            }
            catch(InputMismatchException e){
                System.out.println("Please enter a value between 1 and 4");
                singlePlay();
            }
        }
        if(sticks<21){
            try{
                System.out.println("Enter the number of sticks you want to pick or press 0 to exit,Player 1);
                int n=read.nextInt();
                if(n==0){
                    System.out.println("See you soon");
                    System.exit(0);
                }
                else if(n<1||n>4){
                    while(n<1||n>4){
                        System.out.println("Please enter a value between 1 and 4 only.");
                        n=read.nextInt();
                    }      
                }
                else{
                    if(sticks+n>21){
                        System.out.println("Limit of 21 sticks exceeded.");                         singlePlay();
                     }
                     else{
                         sticks+=n;                    
                         if(sticks>=20&&num%2==0)                         last=1; 
                         
                        
                         else if(sticks>=20)                   last=2; 
                          System.out.println("Player 1 picked "+n+" sticks ");
                          if(sticks==21){
                             decideWin();
                             sticks=22;  
                         }
                         System.out.println("Player 2 picked 4 sticks ");
                         sticks+=4;
                         num+=1;
                         
                     }
                     singlePlay();
                 }
             }
             catch(InputMismatchException e){
                 System.out.println("Please enter a value between 1 and 4");
                 singlePlay();
             }
         }
    }
    int getCompSticks(int n){
        //if(sticks<10){
            switch(n){
                case 1: return 4;
                case 2: return 3;
                case 3: return 2; 
                case 4: return 1;
            }
        //}
        /*else{
            switch(n){
                case 1: return 4;
                case 2: return 3;
                case 3: return 2; 
                case 4: return 1;
            }
            if(n==1)                         n=4; 
            else if(n==2)                    n=3;
            else if(n==3)                    n=2;
            else if(n==4)                    n=1;                                
        } 
        return -22;
    }*/
}