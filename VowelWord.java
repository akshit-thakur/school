import java.util.*;
class VowelWord{
    String str; /**Stores the sentence*/
    int freq; /**stores the frequency of vowel beginning words*/
    VowelWord(){
        str="";
        freq=0;
    }
    void readStr(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the sentence and terminate properly.");
            str=read.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("Error! Try again");
            readStr();
        }
    }
    void freqVowel(){ /**finds the freq*/
        int j=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch==' '||ch=='.'||ch==','||ch=='?'||ch=='!')&&i!=str.length()-1){
                if(isVowel(str.charAt(j)))
                freq+=1;
                j=i+1;
            }
        }
    }
    boolean isVowel(char x){ /**return true if character is vowel(Upper or Lower Case)*/
        switch(x){
            case 'a': case 'e': case 'i': case 'o': case 'u': return true;
            case 'A': case 'E': case 'I': case 'O': case 'U': return true;
            default: return false;
        }
    }
    void display(){
        System.out.println("The sentence is: \n"+str);
        System.out.println("Frequency of Words beginning with vowel is: "+freq);
    }
    public static void main(String args[]){
        VowelWord obj=new VowelWord();
        obj.readStr();
        obj.freqVowel();
        obj.display();
    }
    
}