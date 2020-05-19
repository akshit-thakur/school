/**Started 24-8-15
   To do:
   Remove duplictes to avoid duplicates in printing stuff
   TO pinpoitn correct numbers and induce no. of tries in play();*/
import java.util.*;
class MasterMind{
   int tries,temp1,temp2,temp3,temp4,temp5,temp6;int[] answer=new int[4];int[] guess=new int[4];   String number;
   Scanner read=new Scanner(System.in);
   MasterMind(){       
       tries=0;        temp1=(int)(Math.random()*10);         temp2=(int)(Math.random()*10);
       temp3=(int)(Math.random()*10);   temp4=(int)(Math.random()*10);  temp5=(int)(Math.random()*10); temp6=(int)(Math.random()*10);      number="";
   }
   public static void main(String args[]){
       MasterMind call=new MasterMind();       
       call.starter();
   }
   void rules(){
       System.out.println("Computer will think of sequence of 4 numbers out of 6");
       System.out.println("You have to guess the number in n number of tries");
       System.out.println("Minimum 5 and maximum 15 tries allowed");
       System.out.println("The numbers are : "+temp1+","+temp2+","+temp3+","+temp4+","+temp5+","+temp6);
   }
   void starter(){
       try{
           rules();
           System.out.println("Enter the number of tries you want:");
           tries=read.nextInt();
           if(tries<5||tries>15){
               System.out.println("Number of tries out of range");
               starter();
           }
           getAnswer();
           play();
       }
       catch(InputMismatchException e){
           System.out.println("Error in input! Try again");
           starter();
       }
   }
   void getAnswer(){
       for(int i=0;i<answer.length;i++){
           int temp=(int)(Math.random()*600);
           if(temp<=100)                          answer[i]=temp1;
           else if(temp>100&&temp<=200)           answer[i]=temp2;
           else if(temp>200&&temp<=300)           answer[i]=temp3;
           else if(temp>300&&temp<=400)           answer[i]=temp4;
           else if(temp>400&&temp<=500)           answer[i]=temp5;
           else if(temp>500&&temp<=600)           answer[i]=temp6;
       }
    }   
   void play(){
       try{
           int count1=0,count2=0,count3=0,count4=0;                     
           System.out.println("Enter your guess,enter exit to exit: ");
           String number=read.nextLine();
           if(number.equalsIgnoreCase("exit")){
               System.out.println("See you soon!");
               System.exit(0);
           }
           else if(number.length()!=4){
               System.out.println("Not a valid number.");
               play();
           }
           else{
               int num=Integer.parseInt(number);
               for(int i=guess.length-1;i>=0;i--){ /**print digits in reverse order*/
                   guess[i]=num%10;                  
                   num/=10;
               }
               for(int i=0;i<guess.length;i++){
                   int count=0,q=guess[i];
                   for(int j=0;j<answer.length;j++){
                       if(answer[j]==q)
                       count++;   
                   }            
                   switch(i){
                       case 0: count1=count; break;
                       case 1: count2=count; break;  
                       case 2: count3=count; break;
                       case 3: count4=count; break;
                   }
               }
               System.out.println("Your guess "+number);
               int correct=correctNumbers(count1,count2,count3,count4);
               System.out.print("There is "+correct+" correct numbers.");  
               play();
           }
       }
       catch(InputMismatchException e){
           System.out.println("Error in input!");
           play();
       }
   }   
   int correctNumbers(int a,int b,int c,int d){
       String seq=String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d);
       switch(seq){
           case "0000": return 0;
           case "0001": case "0010":  case "0100": case "1000": return 1;
           case "0011": case "0101":  case "0110": case "1001": case "1010": case "1100": return 2;
           case "0111": case "1011":  case "1101": case "1110": return 3;
           case "1111": return 4;
       }
       return 0;
    }
}