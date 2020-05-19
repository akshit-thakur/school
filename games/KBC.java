/**KBC game 
 * v1.0  150 questions 
    *Started 17-4-15
    *15 questions,more will be added in updates. 
    *To do list: Make flag-based lifelines. 1 for used,0 for unused. 02-05-15(Not done aything in between) Completed 21-05-2015
    *21-05-2015 Do something wihth lifelinedo() shows all used even if some left Completed Same Day
    *23-05-2015 Changes made: LifeLines and Mark turned string to reduce lines from 500+ to <350..only question answer filling left. Then game is completed
    *27-11-2015 Will release full game with 150-300 questions
    *09-12-2015 Included starter() for better exception handling,converted Strings to char,introduced choiceIsValid
    *12-10-2016 Got a good way to use int selector. Can make 2D matrix of answers of 15 rows and 10 columns,question to display,all lifelines,included etc in other class.
    *27-10-2016 Laid out the layout for game... question input remains. 
*/
import java.util.*;
class KBC{  
    static Scanner read=new Scanner(System.in);    int num,f,p,a,e,selector;
    KBC(){
        num=0;        f=0;        p=0;        a=0;        e=0; selector=0;
    }
    public static void main(String args[]){            
        KBC call=new KBC();        
        call.starter();
    }
    void starter(){
        try{
            System.out.println("----------------Welcome to KBC---------------");
            rules();
            System.out.println("Are you ready? Press y or any other key");   
            char go=read.next().charAt(0);  
            if(!(Character.toUpperCase(go)=='Y')){
                System.out.println("OK. See you soon!!");
                System.exit(0);
            }
            else{
            stage();   dispNextQuestion();
            }
        }
        catch(Exception e){
            System.out.println("Error occured! Retry");
            starter();
        }
    }
    /**Methods display the fifteen question.Started 12:59 PM 7/2/2014*/
    void dispNextQuestion(){  
        System.out.print("Next question for "+mark(num+1)+" on your screen");        for(int i=0;i<900000000;i++);        System.out.println(" now!!");
        selector=(int)(Math.random()*10);
        selector=1;
        switch(num){
            case 0:   System.out.print("Question 1. ");
            switch(selector){
                case 1: System.out.println("Who is the President of India? ");                  System.out.println("A. Pranab Mukherjee.\tB. Dr. A.P.J. Abdul Kalam");
                System.out.println("C. Pratibha Patil.\tD. Dr. Rajendra Prasad");               break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }
            break;
            case 1: System.out.print("Question 2. ");
            switch(selector){
                case 1: System.out.println("Who is the recipient of Dada Saheb Phalke Award 2015?");                System.out.println("A. Pran Sikand\tB.Shashi Kapoor");          
                System.out.println("C. Amitabh Bachchan\tD.Dilip Kumar");                                           break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }
            case 2: System.out.print("Question 3. ");
            switch(selector){
                case 1: System.out.println("Which is the first indigeneously made Light Combat Aircraft of India?");                System.out.println("A. Visakhapatnam\tB. Vikrant");                            
                System.out.println("C. Tejas\tD. Vizag");      break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }
            case 3: System.out.print("Question 4. ");
            switch(selector){
                case 1: System.out.println("Which is the oldest edible product for mankind,having thousands of varities?");
                System.out.println("A. Curd\tB. Cheese");                System.out.println("C. Honey\tD. Butter");                break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }
            case 4: System.out.print("Question 5. ");
            switch(selector){
                case 1:System.out.println("Which is the largest news agency of India?");                 System.out.println("A. Asian News International(ANI)\tB. Samachar Bharti (SB)");
                System.out.println("C. Indo-Asian News Service(IANS)\tD. Press Trust of India(PTI)");    break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }            
            case 5: System.out.print("Question 6. ");
            switch(selector){
                case 1: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 6: System.out.print("Question 7. ");
            switch(selector){
                case 1: System.out.println("Which political party contested on the most number of constituencies in 2014 general elections?");
                System.out.println("A. Bahujan Samajvad Party(BSP)\tB. Aam Aadmi Part(AAP)");             System.out.println("C. Communis Party(Marxist)(CP(M))\tD. Communist Party of India(CPI)");
                break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 7: System.out.print("Question 8. ");
            switch(selector){
                case 1: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 8: System.out.print("Question 9. ");
            switch(selector){
                case 1: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 9: System.out.print("Question 10. ");
            switch(selector){
                case 1: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 10: System.out.print("Question 11. ");
            switch(selector){
                case 1: System.out.println("Which cosmetic brand was launched by JRD Tata on advice of Pandit Nehru who wanted to cut the import costs of cosmetics?");          
                System.out.println("A. L'Oréal \tB. Pond's");                System.out.println("C. Revlon\tD. Lakme");                break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 11: System.out.print("Question 12. ");
            switch(selector){
                case 1:System.out.println("According to 69th Constitutional Amendment Act,1991 when did National Capital Region came into force?"); 
                System.out.println("A. Jan,1992\tB. March,1991");                  System.out.println("C. Feb,1992\tD. April,1993");                break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 12: System.out.print("Question 13. ");
            switch(selector){
                case 1: System.out.println("What was the name of State Bank of India before nationalisaton? "); System.out.println("A. Imperial Bank of India\tB. Indian Imperial Bank");                
                System.out.println("C. Royal Bank of India\tD. Hindustan Commercial Bank");                break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 13: System.out.print("Question 14. ");
            switch(selector){
                case 1: System.out.println("Who is the first nobel laureate to win two nobel prizes working in the same field?");
                System.out.println("A. Marie Curie\tB. John Bardeen");                 System.out.println("C. Frederick Sanger\tD. Linus Pauling");                break;
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
            case 14: System.out.print("Question 15. ");
            switch(selector){
                case 1: System.out.println("Which is the first country to legalize child labour?");  
                System.out.println("A.\tB.");                System.out.println("C.\tD.");                break; 
                case 2: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 3: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 4: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 5: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 6: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 7: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 8: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 9: System.out.println("");                System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
                case 10: System.out.println("");               System.out.println("A.\tB.");
                System.out.println("C.\tD.");                  break;
            }break;
        }
        if(num<15)        doQuestion();
        else{   
            System.out.println("Thank you for playing.\nEnter y to quit or any other key to play again");
            char go=read.next().charAt(0);
            if(Character.toUpperCase(go)=='Y') System.exit(0);                else                starter();        
        }        
    }
    void doQuestion(){
        try{
            lifeLineDo();     
            System.out.println("Enter your choice.Press q to quit.");
            char choice=read.next().charAt(0);
            while(choiceIsValid(choice))  
            choice=read.next().charAt(0);             
            if(Character.toUpperCase(choice)==getAnswer()){  
                yes();                
                System.out.println("\n\n\n\n");      
                dispNextQuestion();      
                num++;
            }
            else if(Character.toUpperCase(choice)=='Q')
            quit(); 
            else  
            no();  
        }
        catch(Exception e){
            System.out.println("Error! Please input the values again!");
            doQuestion();
        }
    }
    boolean choiceIsValid(char ch){
        return (!(Character.isLetter(ch))||(!(ch=='a')&&!(ch=='b')&&!(ch=='c')&&!(ch=='d')&&!(ch=='q')))?true:false;
    }
    char getAnswer(){
        switch(num){
            case 0: return 'A';            
            case 1: return 'B';            
            case 2: return 'C';        
            case 3: return 'B';            
            case 4: return 'D';           
            case 5: return ' ';            
            case 6: return 'A';           
            case 7: return ' ';        
            case 8: return ' ';         
            case 9: return ' ';           
            case 10:return ' ';            
            case 11:return ' ';
            case 12:return 'A';            
            case 13:return 'B';            
            case 14:return ' ';           
        }
        return ' ';
    }
    /**Methods to display messages on correct,incorrect answers and quitting*/    
    void yes(){
        num++;        System.out.println("Correct Answer! Well Played");        System.out.println("You won Rs. "+mark(num));        
    }
    void no(){
        System.out.println("Wrong Answer. The correct answer was "+getAnswer());        System.out.print("You won Rs. ");
        if(num<3)        System.out.println("0");
        else if(num>3&&num<7)        System.out.println("20,000");
        else        System.out.println("3,20,000");
    }
    void quit(){
        System.out.println("The correct answer was "+getAnswer());        System.out.println("You quit. \nYou won Rs "+mark(num));       
    }    
    /**Method to choose the question number and display the winnings.*/ 
    String mark(int x){ switch(x){case 0: return "0";/**/case 1: return "5,000";/**/case 2: return "10,000";/**/case 3: return "20,000";/**/case 4: return "40,000";/**/case 5: return "80,000";/**/case 6: return "1,60,000";/**/case 7: return "3,20,000";/**/case 8: return "6,40,000";/**/case 9: return "12,50,000";/**/
            case 10:return "25,00,000";/**/case 11:return "50,00,000";/**/case 12:return "1,00,00,000";/**/case 13:return "3,00,00,000";/**/case 14:return "5,00,00,000";
        } return null;
    }   
    void stage(){System.out.println("14.Rs 5 Crores\n13.Rs 3 Crores\n12.Rs 1 Crores\n11.Rs 50,00,000\n10. Rs 25,00,000\n9.Rs 12,50,000\n8.Rs. 6,40,000\n7.Rs 3,20,000\n6.Rs 1,60,000");
        System.out.println("5.Rs 80,000\n4.Rs 40,000\n3.Rs 20,000\n2.Rs 10,000\n1.Rs 5,000\n");
    }
    void rules(){      System.out.println("There will be 15 questions asked and you will have 4 lifelines(Don't trust your friend,questions are tricky).");
        System.out.println("There will be 2 bases. Rs 20,000 and Rs 3,20,000.");
        System.out.println("All input to be given in small letters. Input taking will not stop unless proper/deseired input is given");
    }
    /**Methods to display the lifelines. Started 8:05 PM 7/2/2014*/
    void lifeLineDo(){
        try{
            if(lifelineIsAvailable()){
                lifeline(f,p,a,e);
                System.out.println("Do you want a lifeline. Press y for yes and any other key for no");
                char ch=read.next().charAt(0);                
                if(Character.toLowerCase(ch)=='y')
                lifeline(); 
                if(Character.toLowerCase(ch)=='y'&&lifelineIsAvailable()){
                    System.out.println("Do you want another lifeline?");              
                    ch=read.next().charAt(0);           
                    if(Character.toLowerCase(ch)=='y'&&lifelineIsAvailable()){
                        lifeline(f,p,a,e);
                        lifeline();                  
                        System.out.println("Do you want another lifeline?");     
                        ch=read.next().charAt(0);              
                    }          
                    if(Character.toLowerCase(ch)=='y'&&lifelineIsAvailable()){
                        lifeline(f,p,a,e);lifeline();
                        System.out.println("Do you want another lifeline?");
                        ch=read.next().charAt(0);   
                        lifeline();
                    }
                }
            }
            else
            System.out.println("All lifelines used!");
        }
        catch(Exception e){
            System.out.println("Error! Please input the values again!");
            lifeLineDo();
        }
    }
    void lifeline(){       
        try{
            System.out.println("Enter the lifeline number you want from 1 to 4.");
            int m=read.nextInt();     
            if(m==1)        f=1;                  else if(m==2)   p=1;            else if(m==3)   a=1;            else if(m==4)   e=1;
            switch(m){
                case 1: System.out.println("Computer! Please remove 2 wrong answers.");             for(long i=0;i<1000000000;i++);                    System.out.println("The options left are:"+fifty()+"\n");                    break;
                case 2: System.out.println("Your Friend's Guess Sure?");                    for(long i=0;i<30000000;i++);                    System.out.print(phone()+"\n");                   break;
                case 3: System.out.println("Audience! Your time for voting has come. Take voting pads in your hands and vote. Time Starts Now!");                    for(long i=0;i<50000000;i++);                    System.out.print("The Audience says: "+audience()+"\n");                    break;
                case 4: for(long i=0;i<100020000;i++);  System.out.println("The Expert's guess Sure?");                     System.out.print(expert()+"\n");                   break;
                default:System.out.println("Invalid! Try again.");                lifeLineDo();
            }
        } 
        catch(Exception e){
            System.out.println("Error! Please input the values again!");
            lifeline();
        }
    }
    void lifeline(int f,int p,int a,int e){
        System.out.println("You have these life lines:-");        if(f!=1)        System.out.println("1. 50-50.");        if(p!=1)        System.out.println("2. Phone-A-Friend.");        if(a!=1)        System.out.println("3. Audience Poll.");        if(e!=1)        System.out.println("4. Ask the Expert.");
    }
    boolean lifelineIsAvailable(){       
       return (f==0||p==0||a==0||e==0)?true:false;
    }
    String fifty(){        
        switch(num){
            case 0: switch(selector){
                case 1: return "A. Pranab Mukherjee\n\tD. Dr.Rajendra Prasad";
                case 2: return "";
                case 3: return "";
                case 4: return "";
                case 5: return "";
                case 6: return "";
                case 7: return "";
                case 8: return "";
                case 9: return "";
                case 10: return "";
            }
            case 1: switch(selector){
                case 1: return "The options left are:\n"+"\tB. Shashi Kapoor\n\tD. Dilip Kumar";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 2: switch(selector){
                case 1: return "The options left are:\n\nC. Tejas\tD. Vizag";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 3: switch(selector){
                case 1: return "The options left are:\n\tB. Cheese\n\tD. Butter";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 4: switch(selector){
                case 1: return "The options left are:\n\tB. Samachar Bharti(SB)\n\tD. Press Trust of India";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 5: switch(selector){
                case 1: return "The options left are:\n";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 6: switch(selector){
                case 1: return "The options left are:\nA. Bahujan Samajvad Party(BSP)\nC. Communist Party(Marxist)";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 7: switch(selector){
                case 1: return "The options left are:\n";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 8: switch(selector){
                case 1: return "The options left are:\n";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 9: switch(selector){
                case 1: return "The options left are:\n";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 10: switch(selector){
                case 1: return "The options left are:\n\tB. Pond's\n\tD. Lakme";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 11: switch(selector){
                case 1: return "The options left are:\n\nC. Feb,1992\tD.April,1993 ";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 12: switch(selector){
                case 1: return "The options left are:\nA. Imperial Bank of India\n\tD. Hindustan Commercial Bank";  
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 13: switch(selector){
                case 1: return "The options left are:\n\tA. Marie Curie\tB. John Bardeen";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }
            case 14: switch(selector){
                case 1: return "The options left are:\n";
                case 2: return "The options left are:\n";
                case 3: return "The options left are:\n";
                case 4: return "The options left are:\n";
                case 5: return "The options left are:\n";
                case 6: return "The options left are:\n";
                case 7: return "The options left are:\n";
                case 8: return "The options left are:\n";
                case 9: return "The options left are:\n";
                case 10: return "The options left are:\n";
            }} return null;
    }
    String phone(){        
        switch(num){
            case 0: switch(selector){
                case 1: return "   \tA\t   100%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            
            }
            case 1: switch(selector){
                case 1:    return "   \tB\t   95%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }            
            case 2: switch(selector){
                case 1: return "   \tC\t   90%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 3: switch(selector){
                case 1: return "   \tB\t   90%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }            
            case 4: switch(selector){
                case 1: return "   \tD\t   85%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }            
            case 5: switch(selector){
                case 1: return "   \t \t    %"; 
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 6: switch(selector){
                case 1: return "   \tA\t   60%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 7: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 8: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 9: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 10: switch(selector){
                case 1: return "   \tD\t   78%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 11: switch(selector){
                case 1: return "   \tC\t   60%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 12: switch(selector){
                case 1: return "   \tA\t   40%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 13: switch(selector){
                case 1: return "   \tA\t   50%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 14: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }}return null;
    }
    String audience(){        
        switch(num){
            case 0: switch(selector){
                case 1: return "A: 95% B: 3% C: 2% D:0%";   
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 1: switch(selector){
                case 1: return "A: 10% B: 89% C: 0% D: 1%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 2: switch(selector){
                case 1: return "A: 11% B: 1% C: 58% D: 30%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 3: switch(selector){
                case 1: return "A: 10% B: 50% C: 30% D: 10%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }  
            case 4: switch(selector){
                case 1: return "A: 20% B: 10% C: 30% D: 40%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 5: switch(selector){
                case 1: return "A: % B: % C: % D:%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }   
            case 6: switch(selector){
                case 1: return "A: 60% B: 0% C: 0% D: 40%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 7: switch(selector){
                case 1: return "A: % B: % C: % D:%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 8: switch(selector){
                case 1: return "A: % B: % C: % D:%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 9: switch(selector){
                case 1: return "A: % B: % C: % D:%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 10: switch(selector){
                case 1: return "A: 24% B: 26% C: 10% D: 40%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 11: switch(selector){
                case 1: return "A: 10% B: 20% C: 40% D: 30%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 12: switch(selector){
                case 1: return "A: 51% B: 4% C: 5% D: 40%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 13: switch(selector){
                case 1: return "A: 40% B: 50% C: 8% D: 2%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }
            case 14: switch(selector){
                case 1: return "A: % B: % C: % D:%";
                case 2: return "A: % B: % C: % D:%";
                case 3: return "A: % B: % C: % D:%";
                case 4: return "A: % B: % C: % D:%";
                case 5: return "A: % B: % C: % D:%";
                case 6: return "A: % B: % C: % D:%";
                case 7: return "A: % B: % C: % D:%";
                case 8: return "A: % B: % C: % D:%";
                case 9: return "A: % B: % C: % D:%";
                case 10: return "A: % B: % C: % D:%";
            }}return null;
   }
   String expert(){    
        switch(num){
            case 0: switch(selector){
                case 1: return "   \tA\t   100%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 1: switch(selector){
                case 1: return "   \tB\t   99%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 2: switch(selector){
                case 1: return "   \tC\t   100%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 3: switch(selector){
                case 1: return "   \tB\t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 4: switch(selector){
                case 1: return "   \tD\t   95%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 5: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 6: switch(selector){
                case 1: return "   \tA\t   90%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 7: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 8: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 9: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            } return "   \t \t    %";
            case 10: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 11: switch(selector){
                case 1: return "   \tC\t   88%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            } 
            case 12: switch(selector){
                case 1: return "   \tA\t   60%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 13: switch(selector){
                case 1: return "   \tB\t   58%";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }
            case 14: switch(selector){
                case 1: return "   \t \t    %";
                case 2: return "   \t \t    %";
                case 3: return "   \t \t    %";
                case 4: return "   \t \t    %";
                case 5: return "   \t \t    %";
                case 6: return "   \t \t    %";
                case 7: return "   \t \t    %";
                case 8: return "   \t \t    %";
                case 9: return "   \t \t    %";
                case 10: return "   \t \t    %";
            }}return null;
   }
}
