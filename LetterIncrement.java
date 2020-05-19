import java.io.*;
class LetterIncrement{
    static java.lang.String in,out; /*in stores input letters,out stores output letters*/
    static char ch; /*stores character in the string at specified location*/
    static int len; /*stores length of input string*/
    LetterIncrement(){
        in="";
        ch=' ';
        out="";
        len=0;
    }
    public static void main(String args[])throws IOException{
        LetterIncrement obj=new LetterIncrement();
        obj.getInput();
        if(obj.hasNumber(in)){
            System.out.println("No number allowed. Re-enter:");
            obj.getInput();
        }
        len=in.length();
        out=obj.doDoubleIncrement(in);
        obj.display();        
    }
    void getInput()throws IOException{ /**to initialize in*/
        System.out.println("Enter a string of letters,no number please: ");
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        in=input.readLine();
        in=in.toUpperCase();
    }
    void display(){ /**to display result*/
        System.out.println("Input: "+in);
        System.out.println("Output: "+out);
    }
    boolean hasNumber(java.lang.String str){ /**checks for number in string, returns true if found*/
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch>='0'&&ch<='9')
            return true;
        }
        return false;
    }
    java.lang.String doDoubleIncrement(java.lang.String str){ /**returns the final output string having each letter increased by 2 e.g. A to C*/
        java.lang.String returnStr="";
        for(int i=0;i<len;i++){
            ch=str.charAt(i);
            switch(ch){
                case 'Y': returnStr+='A';	
                break;
                case 'Z': returnStr+='B';
                break;
                default:                
                ch+=2;
                returnStr+=ch;
            }
        }
        return returnStr;
    }
}