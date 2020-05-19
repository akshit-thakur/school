/** First non-author user: - Ankita Thakur, dt. 21st Feb 15
 * v 1.0 ...... 21-02-15
   * v 1.01 ...... 23-02-15 
     *Fixed the display of computer game won in dispScoreBoard fn.,it showed player games won twice.
   * v 1.1 ...... 23-02-15 
     *Added medium and hard difficulties.
   * v1.1.1 ..... 05-04-15 
     *Added default game play to avoid game crash. Added Exceptions which were missing earlier.
   * v1.1.2 ...... 06-04-15 
     *Improved exception handling,starter() included.
   * v1.1.3 (unreleased)......10-12-15
     *Default gameplay removed with inclusion of while loops in starter()
     *Reduced signatures in play() from 5 to 1 by making games,choice,player,comp scores class variables. Made pChoice and randomInt class variable for getComp() method
     *getComp() method to make the code comprehendable, gets the computer input through randomInt
     *option included to restart the game before quitting. 17-12-15
*/
import java.util.*;
class RockPaperScissors{    
    int choice,games,randomInt,player,comp,count; char pChoice;    Scanner read=new Scanner(System.in);
    RockPaperScissors(){
        choice=0;     games=0;  randomInt=0; player=0; comp=0; count=1;
    }
    public static void main(String args[]){
        RockPaperScissors call=new RockPaperScissors();
        call.starter();
    }
    void starter(){          
        System.out.println("Welcome to game of rock-paper-scissors.");
        try{ 
            System.out.print("Difficulty level- Enter 1 for easy, 2 for medium and 3 for hard: ");
            choice=read.nextInt();
            while(choice<=0||choice>3){
                System.out.println("Invalid! Enter 1 for easy, 2 for medium and 3 for hard: ");                choice=read.nextInt();
            }
            System.out.println("How many games?");
            games=read.nextInt();
            while(games<=0){
                System.out.println("Invalid.\nHow many games?");  games=read.nextInt();
            }             
            play();                    
        }                     
        catch(InputMismatchException e){
            System.out.println("Error in input"); 
            starter();
        }
    }
    void play(){        
        try{
            System.out.println("Enter your choice. R for Rock,P for Paper or S for Scissors.E to Exit");
            pChoice=read.next().charAt(0);
            pChoice=Character.toUpperCase(pChoice);    
            randomInt=(int)(Math.random()*100);              
            if(pChoice=='E'){
                System.out.println("See you soon!");
                System.exit(0);          
            }
            else if(pChoice!='P'&pChoice!='R'&pChoice!='S'){
                System.out.println("You chose wrong ");
                play();
            }
            else{
                char cChoice=getComp();                
                System.out.println("You chose "+pChoice+" and computer chose "+cChoice);
                int point=decideWin(pChoice,cChoice);
                if(point==1){
                    System.out.println("Player Won.");
                    player++;
                }
                else if(point==2){
                    System.out.println("Computer Won.");
                    comp++;
                }
                else            System.out.println("Draw");                
                if(count!=games){
                    count+=1; play();
                }
                else{
                    dispScore();
                    System.out.println("Thank you for playing.\nEnter y to quit or any other key to play again");
                    char go=read.next().charAt(0);
                    if(Character.toUpperCase(go)=='Y')             System.exit(0);
                    else        starter();
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error in input"); 
            play();
        }
    }
    char getComp(){
         switch(choice){
             case 1:
             if(randomInt<34)               return 'R';
             else if(randomInt>=34&&randomInt<=67)                 return 'P';   
             else                return 'S';                
             case 2:
             if(pChoice=='R'){
                 if(randomInt<50)                    return 'P';
                 else if(randomInt>=50&&randomInt<=90)                     return 'S'; 
                 else                    return 'R';
             } 
             else if(pChoice=='S'){
                 if(randomInt<50)                    return 'R';
                 else if(randomInt>=50&&randomInt<=90)                     return 'P';
                 else                    return 'S';
             }
             else if(pChoice=='P'){
                 if(randomInt<50)                    return 'S';
                 else if(randomInt>=50&&randomInt<=90)                     return 'R'; 
                 else                    return 'P';
             }
             case 3:
             if(pChoice=='R'){
                 if(randomInt<80)                    return 'P';
                 else if(randomInt>=80&&randomInt<=99)                     return 'S'; 
                 else                    return 'R';
             }               
             else if(pChoice=='S'){
                 if(randomInt<80)                    return 'R';
                 else if(randomInt>=80&&randomInt<=99)                     return 'P'; 
                 else                    return 'S';
             }
             else if(pChoice=='P'){
                 if(randomInt<80)                        return 'S';
                 else if(randomInt>=80&&randomInt<=99)                     return 'R'; 
                 else                    return 'P';
             }
         }
         return ' ';
    }
    int decideWin(char p,char r){
        switch(p){
            case 'R':  
            if(r!='R'&&r!='P')         return 1;  
            else if(r=='P')            return 2;
            case 'P':  
            if(r!='S'&&r!='P')         return 1;
            else if(r=='S')            return 2; 
            case 'S':         
            if(r!='R'&&r!='S')         return 1; 
            else if(r=='R')            return 2;                       
        }
        return -1;
    }
    void dispScore(){
        System.out.println("You won "+player);
        System.out.println("Computer won "+comp);  
        System.out.println("Total games bearing results "+player+comp);
        System.out.println("Total games bearing no results : "+(games-(player+comp)));
        System.out.println("Total games played : "+games);
    }    
}		