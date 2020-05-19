/***chase(),batFirst() done&consolidated,multiPlay remains as on 29/5/16
/**GAME IDEA GERMINATED ON 17-12-15
 * Single or Multiplayer.
 * In single play,chase targets or just set targets batting first.
 * In double play,you know what to do.
 * In chase, a random target selected on basis of difficulty(Easy,Med,Hard)
 * In batFirst, you set a target and it is chased by computer.
 *************************************Program Description**********************************************
 *********************************INSTANCE VARIABLES****************************************
 *****************************char mode: 's'=single,'m'=multi,'e'=exit..... 'c'=chase 'h'=high score.... 'e'=easy 'm'=med 'h'=hard in chase()
 *****************************char diff: difficulty level
 *****************************int target: randomly sets a target should one need it,sets target for 2nd innnings in 2play
 *****************************int overs: 5<overs<=15
 *****************************int runs: 
 *****************************int n: counts the number of overs played
 *****************************int overRuns: runs made in the over.
 *****************************String team names:
 *****************************boolean flag: to save in over view if the target is reached or more than 10 wickets have fallen
 **********************************MEMBER METHODS******************************************************
 ***********************void rules(): 
 ***********************void starter(): ##Starts the game and gets the mode. If single mode,asks for type of game and difficulty.##
 ***********************void setGame(): ##Asks for no. of overs<=10, team names##
 ***********************void singlePlay():   ##target initialized randomly and chase the target in n overs on basis of difficulty##

 ***********************void multiPlay(): ##set target at end of first innings and then starts second innings##
 */
import java.util.*;
class Cricket{     
    char mode,diff,play;
    int overs,target,runs,wickets,overRuns,n;
    String team1,team2;   boolean flag;
    Cricket(){
        mode=' '; overs=0; target=0; runs=0; team1=""; team2=""; overRuns=0; flag=false; n=1;
    }
    public static void main(String args[]){
        Cricket call=new Cricket();
        call.starter();
    }
    void rules(){     
        //e->min run a ball...max 16 runs a over. m->12-22 h->20-30
    }
    void starter(){
        try{
            Scanner read=new Scanner(System.in);
            rules();
            do{
               System.out.println("Enter S for single player,M for multiplayer or E to exit");
               mode=Character.toUpperCase(read.next().charAt(0));
            }while(mode!='E'&&mode!='S'&&mode!='M');
            if(mode=='E')  System.exit(0);            
            else if(mode=='S'){                
                do{
                    System.out.println("Enter C to chase and T to set target: ");    
                    mode=Character.toUpperCase(read.next().charAt(0));
                }while(mode!='C'&&mode!='T');
                setGame();
            } 
            else if (mode=='M'){
                setGame();                
                multiplay();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error in input! Retry ");
            starter();
        }
    }
    void setGame(){
        try{ //overs asked first so that target is easily set.
            Scanner read=new Scanner(System.in);            
            do{ //high score needs no difficulty level or team 2
                System.out.println("How many overs?(Enter from 5 to 15)");
                overs=read.nextInt();
            }while(overs<5||overs>15);           
            System.out.println("Enter team name,player 1:");
            team1=read.next();
            if(mode=='M'){
                System.out.println("Enter team name,player 2:");
                team2=read.nextLine();
            }  
            else{
                do{
                    System.out.println("Difficulty Level: Enter E for easy, M for medium and H for hard");
                    diff=Character.toUpperCase(read.next().charAt(0));
                }while(diff!='E'&&diff!='M'&diff!='H');
                //set targets accordingly in chasing
                if(mode=='C'){
                    if(diff=='E')   target=1+(int)(Math.random()*(10)); 
                    else if(diff=='M') target=2+(int)(Math.random()*(10));
                    else target=5+(int)(Math.random()*(10));
                    target*=overs; 
                    System.out.println(team1+" has to chase "+target+" runs in "+overs+" overs.");                    
                }    
                else if(mode=='T')
                System.out.println(team1+" is batting first.");                    
                singlePlay();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error in input! Retry ");
            setGame();
        }
    }   
    int getAdd(){
        if(diff=='E')
        return -1+(int)(Math.random()*10);
        else if(diff=='M')
        return -2+(int)(Math.random()*10);
        else if(diff=='H')
        return -3+(int)(Math.random()*10);
        else return 0;
    }
    void play(){ 
        int add=0; overRuns=0;
        System.out.println("This over: ");
        for(int i=1;i<=6;i++){ 
            do{
                add=getAdd();
            }while(add==5||add>6);
            if(add<0){
                System.out.print("W ");
                if(wickets+1<=10)
                wickets+=1;      
                if(wickets>=10){                        
                    flag=true;    break;
                }
            }
            else{
                System.out.print(add+" ");
                runs+=add;
                overRuns+=add;
                if(mode=='C'&&runs>=target){                        
                    flag=true;     break;
                }           
            }
        }        
    }
    void view(){
          System.out.println("\n"+team1+":"+runs+"/"+wickets);
          System.out.println("Last Over "+overRuns);
          if(target-runs>0&&mode=='C')
          System.out.println("Runs required: "+(target-runs));
          System.out.println("Current Run Rate: "+(float)(runs/n));
          if(overs-n!=0)
          System.out.println("Overs remain: "+(overs-n));          
    }
    int getScore(){
        switch(diff){
            case 'E': return 10+((int)(Math.random()*10)*overs);
            case 'M': return 20+((int)(Math.random()*15)*overs);
            case 'H': return 30+((int)(Math.random()*20)*overs);
        }
        return -1;
    }
    void singlePlay(){ 
        try{ 
            Scanner read=new Scanner(System.in); 
            while(n<=overs){                
               do{
                   System.out.println("Enter p to play the ball/over, e to exit");
                   play=Character.toUpperCase(read.nextLine().charAt(0));
               }while(play!='P'&&play!='E');
               if(play=='E') System.exit(0);
               else{
                   play();             
                   view();  
                   if(flag) break;                   
                   n+=1; //when overs complete and wickets don't fall, n=overs
               }
            }
            if(mode=='C'){
                if(runs>=target)            System.out.println("You have won by "+(10-wickets)+" wickets.");
                else if(wickets==10||n>overs)        System.out.println("You have lost by "+(target-runs)+" runs.");
                System.out.println("Your final score is: "+runs+"/"+wickets);               
            }
            else if(mode=='T'){
                int oppScore;
                System.out.println("You set target of "+(runs+1));
                do{
                    oppScore=getScore();
                }while(oppScore>runs+6);
                System.out.println("The opponent has scored "+oppScore);
                if(oppScore<runs)           System.out.println("You have won by: "+(runs-oppScore)+" runs.");
                else if(oppScore>=runs)     System.out.println("You have lost.");
            }            
        }
        catch(Exception e){
            System.out.println("Error!");
            singlePlay();
        }        
    }    
    String toss(){
        if((Math.random()*100)<=50) return team1;
        else return team2;
    }
    void multiplay(){
        String winner="",decide;
        try{ 
            Scanner read=new Scanner(System.in); 
            System.out.println("Type 'flip' to toss the coin,anything else to exit.");
            decide=read.next();
            if(decide.equalsIgnoreCase("flip"))           winner=toss();
            else             System.exit(0);
            System.out.println(winner+" has won the toss.\n Enter 'bat' to bat and 'bowl' to bowl");
            decide=read.next();
            if(decide.equalsIgnoreCase("bat")) System.out.println();
            else ;
            //coin toss incomplete. complete it later
        }
        catch(Exception e){
            System.out.println("Error!");
            multiplay();
        }        
    }
}