import java.util.InputMismatchException;
import java.util.Scanner;
class ISBN{
    java.lang.String code;
    int len; 
    int sum;
    ISBN(){
        code="";
        len=0;
        sum=0;
    }
    void getInput(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the ISBN code: ");
            code=read.nextLine();            
            len=code.length();
            if(len!=10){
                System.out.println("Enter 10 digit code. Try again: ");
                getInput();
            }       
            for(int i=0;i<len;i++){
                char ch=code.charAt(i);
                if(isValid(ch))
                continue;
                else{
                    System.out.println(ch+" not valid. Try again: ");
                    getInput();
                }   
            }
            read.close();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid format! Try again");
            getInput();
        }
    }
    boolean isValid(char ch){
        switch(ch){
            case '0':            case '1':            case '2':            case '3':            case '4':
            case '5':            case '6':            case '7':            case '8':            case '9':
            case 'X': return true;            default:  return false;
        }    
    }
    int valueOf(char ch){
        switch(ch){
            case '0': return 0;  case '1': return 1;  case '2': return 2;  case '3': return 3;  case '4': return 4;
            case '5': return 5;  case '6': return 6;  case '7': return 7;  case '8': return 8;  case '9': return 9;
            case 'X': return 10; default: return -1;
        }    
    }
    void getSum(){
        int ctr=10; int n=0;
        for(int i=0;i<len;i++){
            n=valueOf(code.charAt(i));
            sum+=(n*ctr);
            ctr-=1;            
        }                
    }    
    boolean isISBN(int sum){
        return sum%11==0?true:false;
    }
    void display(){
        System.out.println("The code :"+code);
        System.out.println("Sum = "+sum);
        if(isISBN(sum))
        System.out.println("Sum divisible by 11. Hence code is ISBN.");
        else
        System.out.println("Not divisible by 11. Hence code is not ISBN.");
    }
    public static void main(String args[]){
        ISBN obj=new ISBN();
        obj.getInput();
        obj.getSum();
        obj.display();       
    }
}