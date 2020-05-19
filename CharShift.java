import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class CharShift{
    public static void main(String args[]) throws IOException{
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter a word.");
        java.lang.String word=input.readLine();
        System.out.println("Each letter is replaced by the next letter, Output is:");
        int len=word.length();
        for(int i=0;i<len;i++){
            char ch=word.charAt(i);
            ch++;
            System.out.print(ch);
        }
    }
}