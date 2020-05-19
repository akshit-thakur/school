import java.util.*;
class Potential{
    String sentence,word; String words[]; int ctr,potential,count; int[] potentials;
    Potential(){
        sentence="";        word="";               ctr=0;  count=0;         potential=0;        
    }
    void getInput(){ /**gets the sentence*/
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter a sentence and terminate properly: ");
            sentence=read.nextLine();
            sentence=sentence.toUpperCase();
            words=new String[sentence.length()];
        }
        catch(InputMismatchException e){
            System.out.println("Error! Try again.");
            getInput();
        }       
    }
    void getWords(){ /**extracts the words from sentence and puts it into an array of words*/
        int j=0;
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);            
            if(ch==' '||ch=='.'||ch==','||ch=='?'||ch=='!'){                
                words[ctr]=sentence.substring(j,i);
                System.out.println(sentence.substring(j,i));
                j=i+1;
                ctr+=1;
            }            
        }
        potentials=new int[ctr];
    }
    void findPotential(){ /**extracts the word from array of words,breaking the word into letters,finding potential of each letter and adding it to total potential of that word*/       
        for(int i=0;i<ctr;i++){
            String word=words[i]; potential=0;
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                potential+=getPotential(ch);               
            }
            potentials[count]=potential;
            count+=1;
        }        
    }
    void arrangePotential(){ /**Bubble Sort*/
        for(int i=0;i<count;i++){ 
            for(int j=0;j<count-i-1;j++){
                if(potentials[j]>potentials[j+1]){
                    int temp=potentials[j];                    potentials[j]=potentials[j+1];                    potentials[j+1]=temp;
                    String tempStr=words[j];                    words[j]=words[j+1];                    words[j+1]=tempStr;
                }
            }
        }
    }
    void displayBefore(){ /**before arranging words as per the demand of question*/
        System.out.println("Words and their potentials:");
        for(int i=0;i<ctr;i++)        System.out.println(words[i]+" "+potentials[i]);    
    }
    void displayAfter(){ /**displays the sorted list of words*/
        System.out.println("Words in ascending order of potential: ");
        for(int i=0;i<ctr;i++)        System.out.print(words[i]+" ");
    }
    int getPotential(char x){ /**to find potential of  each letter*/
        switch(x){
            case 'A': return 1; 
            case 'B': return 2; 
            case 'C': return 3; 
            case 'D': return 4; 
            case 'E': return 5; 
            case 'F': return 6; 
            case 'G': return 7; 
            case 'H': return 8; 
            case 'I': return 9; 
            case 'J': return 10; 
            case 'K': return 11; 
            case 'L': return 12; 
            case 'M': return 13; 
            case 'N': return 14; 
            case 'O': return 15; 
            case 'P': return 16; 
            case 'Q': return 17; 
            case 'R': return 18; 
            case 'S': return 19; 
            case 'T': return 20; 
            case 'U': return 21; 
            case 'V': return 22; 
            case 'W': return 23; 
            case 'X': return 24; 
            case 'Y': return 25; 
            case 'Z': return 26; 
            default: return -1;
        }
    }
    public static void main(String args[]){
        Potential obj=new Potential();
        obj.getInput();
        obj.getWords();
        obj.findPotential();
        obj.displayBefore();
        obj.arrangePotential();
        obj.displayAfter();
    }
}