//uses recursion
import java.util.*;
class Change{
    String str;
    String newStr;
    int len;
    Change(){
        str=""; newStr=""; len=0;
    }
    void inputWord(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the string: ");
            str=read.nextLine();     
            len=str.length();
        }
        catch(InputMismatchException e){
            System.out.println("Error! Try again");
            inputWord();
        }
    }
    char caseConvert(char ch){
        if(Character.isUpperCase(ch))
        return Character.toLowerCase(ch);
        else if(Character.isLowerCase(ch))
        return Character.toUpperCase(ch);
        else return ch;
    }
    void recChange(int c){
        if(c==len) return;
        else{
            newStr+=caseConvert(str.charAt(c));
            recChange(c+1);
        }
    }
    void display(){
        System.out.println("The original string: "+str);
        System.out.println("The new string: "+newStr);
    }
    public static void main(String args[]){
        Change obj=new Change();
        obj.inputWord();
        obj.recChange(0);
        obj.display();
    }
}