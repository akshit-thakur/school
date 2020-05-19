//TODO change sweet to swet and thhis to this 
import java.util.*;
class DeleteRepeat{
    String str;    int len;    String resultStr; /**str stores original string while resultStr stores the final string*/
    DeleteRepeat(String x){ /**Parameterized constructor initiliazes string and its length*/
        str=x;        len=str.length(); resultStr="";
    }
    public static void main(String args[]){ /**calls method to delete the repeated letters and to display the result*/
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter a string ");
            String x=read.nextLine();
            DeleteRepeat obj=new DeleteRepeat(x);
            obj.deleteRepeats();
            obj.display();
        }
        catch(InputMismatchException e){
            System.out.println("Input Error. Terminating Program.");
        }
    }   
    void deleteRepeats(){ /**deletes the immediate repeat of the first letter,if found*/
        int j=0;
        for(int i=0;i<len;i++){
            char ch=str.charAt(i); ch=Character.toLowerCase(ch);
            char ch1=(i+1)==len?str.charAt(len-1):str.charAt(i+1); ch1=Character.toLowerCase(ch1);    /**if next character is last, assign len-1 char to it else assign i+1 char to it*/        
            if(ch1==ch){ /**if double letter found*/
                resultStr=resultStr.concat(str.substring(j,i+1)); j=i+2;
            }
        }        
    }
    void display(){
        System.out.println("The string after deleting double letters is: \n"+resultStr);
    }
}