import java.util.*;
class ConsoVowels{
    String sent;
    int len;
    String[] words;
    int[] vowels;
    int[] consonants;
    int ctr;
    int countV;
    int countC;
    ConsoVowels(){/**no practical purpose*/
    }
    ConsoVowels(String str){
        sent=str;
        len=sent.length();
        words=new String[len];
        vowels=new int[len];
        consonants=new int[len];
        ctr=0;
        countV=0;
        countC=0;
    }
    String getInput(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter a properly terminated (. or ? terminated sentence)");
            String str=read.nextLine();            
            if(isTerminated(str)){
                return str;
            }                
            else{
                System.out.println("Not terminated properly, terminate with . or ?");
                getInput();
            }            
        }
        catch(InputMismatchException e){
            System.out.println("Error! Try again!");
            getInput();
        } 
        return "";
    }
    void fillWords(){/**Extracts words form sentence and fills an array*/
        int j=0; 
        for(int i=0;i<len;i++){
            char ch=sent.charAt(i);
            System.out.println(ch+","+i+","+j);
            if(ch==' '||ch==','||ch=='.'||ch=='?'||ch=='!'){
                words[ctr]=sent.substring(j,i);
                j=i+1;          
                ctr+=1;
            }        
        }
    }
    void convertCase(){/**converts the first letter of each word to uppercase*/
        for(int i=0;i<ctr;i++){
            int l=words[i].length();
            char ch=words[i].charAt(0);
            String dummy=words[i].substring(1,l);            
            ch=Character.toUpperCase(ch);
            words[i]=String.valueOf(ch)+dummy;
        }
    }
    void fillConsoVowel(){/**fills the consonant and vowels integers array adjacent to the word's address in its String array*/
        for(int i=0;i<ctr;i++){
            countV=0; countC=0;
            String str=words[i];
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);               
                if(isVowel(ch))
                countV++;
                else
                countC++;                
            }
            vowels[i]=countV;
            consonants[i]=countC;          
        }    
    }
    void display(){
        for(int i=0;i<ctr;i++)
        System.out.print(words[i]+" ");        
        System.out.println("\nWord\t\tVowels\t\tConsonants");
        for(int i=0;i<ctr;i++)
        System.out.println(words[i]+"\t\t"+vowels[i]+"\t\t"+consonants[i]);        
    }
    boolean isTerminated(String str){/**checks if sentence is terminated*/
        char ch=str.charAt(str.length()-1); 
        return (ch=='.'||ch=='!')?true:false;        
    } 
    boolean isVowel(char ch){/**Checks if character is vowel*/
        switch(Character.toUpperCase(ch)){
            case 'A': case 'E': case 'I': case 'O': case 'U': return true; default: return false;
        }        
    }
    public static void main(String args[]){
        ConsoVowels obj=new ConsoVowels();
        String dummy=obj.getInput();   
        obj=new ConsoVowels(dummy);
        obj.fillWords();
        obj.convertCase();
        obj.fillConsoVowel();
        obj.display();
    }
}