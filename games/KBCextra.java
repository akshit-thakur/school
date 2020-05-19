/*Put Selector check in all associated functions dated 24/1/15*/
//9:08 PM 6/30/2014
//import java.io.*;
class KBCextra{ 
   int num=0,selector=0;
    /*public static void main(String args[])throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------------Welcome to KBC---------------");
        KBCextra obj=new KBCextra();
        obj.rules();
        System.out.println("Are you ready? Press y or n");
        String z=input.readLine();  
        if(z.equalsIgnoreCase("n"))
        System.out.println("O.K. Try again later!!");
        else if(z.equalsIgnoreCase("y")){
            obj.stage();
            obj.disp1();     
            obj.do1();      
            switch(obj.num){
                case 1:
                obj.disp2();
                obj.do2();
                break;
                case 2:  disp3();
                    do3();  break;
                case 3: disp4();
                    do4();  break;
                case 4:     disp5();
                    do5();  break;
                case 5: disp6();
                    do6();  break;
                    case 6:     disp7();
                    do7();  break;
                case 7: disp8();
                    do8();  break;
                case 8:     disp9();
                    do9();  break;
                case 9: disp10();    
                    do10(); break;
                case 10:    disp11();    
                    do11(); break;
                case 11:    disp12();    
                    do12(); break;
                case 12:    disp13();        
                    do13(); break;
                case 13:    disp14();    
                    do14(); break;
                case 14:    disp15();    
                    do15(); break; 
                default: System.out.println();
            }
        }
        else
        System.out.println("Invalid.");         
    }
        //Methods display the fifteen question.Started 12:59 PM 7/2/2014
    void disp1(){
        selector=(int)(Math.random()*100);
        if(selector<=10){
            System.out.println("Question 1. Who is the President of India? ");
            System.out.println("A. Pranab Mukherjee.\tC. Dr. A.P.J. Abdul Kalam");
            System.out.println("B. Pratibha Patil.\tD. Dr. Rajendra Prasad");
        }
        else if(selector>10&&selector<=20){
            System.out.println("Question 1. Dummy 1");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>20&&selector<=30){
            System.out.println("Question 1. Dummy 2");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>30&&selector<=40){
            System.out.println("Question 1. Dummy 3");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>40&&selector<=50){
            System.out.println("Question 1. Dummy 4");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>50&&selector<=60){
            System.out.println("Question 1. Dummy 5");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>60&&selector<=70){
            System.out.println("Question 1. Dummy 6");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>70&&selector<=80){
            System.out.println("Question 1. Dummy 7");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>80&&selector<=90){
            System.out.println("Question 1. Dummy 8");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else{
            System.out.println("Question 1. Dummy 9");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
    }
    void do1()throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        lifeline();
        System.out.println("Do you want a lifeline. Press y for yes and n for no");
        String ch=input.readLine();
        if(ch.equalsIgnoreCase("y")){
            lifeline(num);
            System.out.println("Do you want another lifeline?");
            ch=input.readLine();
            if(ch.equalsIgnoreCase("y")){
                lifeline(num);
                System.out.println("Do you want another lifeline?");
                ch=input.readLine();
            }
            if(ch.equalsIgnoreCase("y")){
                lifeline(num);
                System.out.println("Do you want another lifeline?");
                ch=input.readLine();
            }
        }
        else{
            if(selector<=10){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("a"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>10&&selector<=20){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("b"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>20&&selector<=30){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("a"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>30&&selector<=40){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("b"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>40&&selector<=50){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("c"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>50&&selector<=60){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("d"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>60&&selector<=70){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("a"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>70&&selector<=80){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("b"))
                yes(); 
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>80&&selector<=90){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("c"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else{
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("d"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();       
            }
        }        
    }      
    void disp2(){
        selector=(int)(Math.random()*100);
        if(selector<=10){
            System.out.println("Question 2. Who is the President of India? ");
            System.out.println("A. Pranab Mukherjee.\tC. Dr. A.P.J. Abdul Kalam");
            System.out.println("B. Pratibha Patil.\tD. Dr. Rajendra Prasad");
        }
        else if(selector>10&&selector<=20){
            System.out.println("Question 2. Dummy 1");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>20&&selector<=30){
            System.out.println("Question 2. Dummy 2");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>30&&selector<=40){
            System.out.println("Question 2. Dummy 3");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>40&&selector<=50){
            System.out.println("Question 2. Dummy 4");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>50&&selector<=60){
            System.out.println("Question 2. Dummy 5");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>60&&selector<=70){
            System.out.println("Question 2. Dummy 6");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>70&&selector<=80){
            System.out.println("Question 2. Dummy 7");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else if(selector>80&&selector<=90){
            System.out.println("Question 2. Dummy 8");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
        else{
            System.out.println("Question 2. Dummy 9");
            System.out.println("A.\tC.");
            System.out.println("B.\tD.");
        }
    }
    void do2()throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        lifeline();
        System.out.println("Do you want a lifeline. Press y for yes and n for no");
        String ch=input.readLine();
        if(ch.equalsIgnoreCase("y"))
        lifeline(num);        
        else{
            if(selector<=10){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("a"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>10&&selector<=20){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("b"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>20&&selector<=30){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("a"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>30&&selector<=40){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("b"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>40&&selector<=50){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("c"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>50&&selector<=60){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("d"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>60&&selector<=70){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("a"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>70&&selector<=80){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("b"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else if(selector>80&&selector<=90){
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("c"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
            else{
                System.out.println("Enter your choice.Press q to quit.");
                String choice=input.readLine();
                if(choice.equalsIgnoreCase("d"))    
                yes();  
                else if(choice.equalsIgnoreCase("q"))
                quit(); 
                else  
                no();
            }
        }        
        
    }
    /**Methods to display messages on correct,incorrect answers and quitting 
    void yes(){
        num++;
        System.out.println("Correct Answer! Well Played");
        System.out.print("You won Rs. ");
        mark(num);
    }
    void no(){
        System.out.println("Wrong Answer.");
        System.out.print("You won Rs. ");
        mark(num);
    }
    void quit(){
        System.out.print("You quit. \nYou Won Rs");
        mark(num);
    }
    //Method to choose the question number and display the winnings.    
    void mark(int x){
        switch(x){
            case 0: System.out.println("0");
            break;
            case 1: System.out.println("5,000");
            break;
            case 2: System.out.println("10,000");
            break;  
            case 3: System.out.println("20,000");
            break;
            case 4: System.out.println("40,000");
            break;
            case 5: System.out.println("80,000");
            break;      
            case 6: System.out.println("1,60,000");
            break;
            case 7: System.out.println("3,20,000");
            break;
            case 8: System.out.println("6,40,000");
            break;
            case 9: System.out.println("12,50,000");
            break;
            case 10: System.out.println("25 Lacs.");
            break;
            case 11: System.out.println("50 Lacs.");
            break;
            case 12: System.out.println("1 Crore.");
            break;
            case 13: System.out.println("3 Crore.");
            break;  
            case 14: System.out.println("5 Crores.");
            break;  
            case 15: System.out.println("7 Crores.");
            break;
            default: System.out.println("Error in mark(int x).");
        }
    }   
    void stage(){
        System.out.println("14.Rs 7 Crores\n13.Rs 5 Crores\n12.Rs 1 Crores");
        System.out.println("11.Rs 50,00,000\n10 Rs 25,00,000\n9.Rs 12,50,000\n8.Rs. 6,40,000\n7.Rs 3,20,000");
        System.out.println("6.Rs 1,60,000\n5.Rs 80,000\n4.Rs 40,000\n3.Rs 20,000\n2.Rs 10,000\n1.Rs 5,000\n");
    }
    void rules(){       
        System.out.println("You can get the chance to opt for lifeline only once per question.");
        System.out.println("There will be 15 questions asked and you will have 4 lifelines.(No Joker Lifeline)");
        System.out.println("There will be 2 bases. Rs 80,000 and Rs 6,40,000.");
        System.out.println("All input to be given in small letters.");      
    }
    //Methods to display the lifelines. Started 8:05 PM 7/2/2014
    void lifeline(int x)throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the lifeline number you want from 1 to 4.");
        int m=Integer.parseInt(input.readLine()); 
        switch(x){
            case 0:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            } 
            break;
            case 1:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 2:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 3:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 4:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 5:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 6:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 7:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 8:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 9:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 10:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 11:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 12:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 13:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            case 14:  
            switch(m){
                case 1: Fifty(x);
                break;
                case 2: Phone(x);
                break;
                case 3: Audience(x);
                break;
                case 4: Flip(x);
                break;
                default: System.out.println("Error in input.. Program Ending.!!");
            }
            break;
            default: System.out.println("Error in programming,syntax wrong in lifeline(int x)");
        }
    }
    void lifeline(){
        System.out.println("You have 4 life lines:-");
        System.out.println("1. 50-50.");
        System.out.println("2. Phone-A-Friend.");
        System.out.println("3. Audience Poll.");
        System.out.println("4. Flip the question.");
    }
    void Fifty(int x){
        switch(x){
            case 0:   break;
            case 1:   break;
            case 2:   break;
            case 3:   break;
            case 4:   break;
            case 5:   break;
            case 6:   break;
            case 7:   break;
            case 8:   break;
            case 9:   break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14:  break;
            default: System.out.println("Error in programming,syntax wrong in Fifty(int x)");
        }
    }
    void Phone(int x){
        switch(x){
            case 0:   break;
            case 1:   break;
            case 2:   break;
            case 3:   break;
            case 4:   break;
            case 5:   break;
            case 6:   break;
            case 7:   break;
            case 8:   break;
            case 9:   break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14:  break;
            default: System.out.println("Error in programming,syntax wrong in Phone(int x)");
        }
    }
    void Audience(int x){
        switch(x){
            case 0:   break;
            case 1:   break;
            case 2:   break;
            case 3:   break;
            case 4:   break;
            case 5:   break;
            case 6:   break;
            case 7:   break;
            case 8:   break;
            case 9:   break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14:  break;
            default: System.out.println("Error in programming,syntax wrong in Audience(int x)");
        }
    }
    void Flip(int x){
        switch(x){
            case 0:   break;
            case 1:   break;
            case 2:   break;
            case 3:   break;
            case 4:   break;
            case 5:   break;
            case 6:   break;
            case 7:   break;
            case 8:   break;
            case 9:   break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14:  break;
            default: System.out.println("Error in programming,syntax wrong in Flip(int x)");
        }
    }
    */
}