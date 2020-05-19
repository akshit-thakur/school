import java.io.*;
class Frequency{
    java.lang.String text; /*stores the sentence*/
    int countand;/*stores frequency of and*/
    int countan;/*stores frequency of an*/ 
    int len;/*stores length of text*/
    Frequency(){
        text="";
        countand=0;
        countan=0;
        len=0;
    }
    void accept(java.lang.String n){
        text=n;
        len=text.length();
    }    
    void checkandfreq(){
        int j=0;
        java.lang.String word=" "; /**stores the words in the sentence,one at a time*/
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '||text.charAt(i)=='.'||text.charAt(i)==','||text.charAt(i)=='!'||text.charAt(i)=='?'){
                word=text.substring(j,i);
                j=i+1; /**first letter of next word's address*/
                if(word.equals("and"))
                countand++;
            }
        }
    }
    void checkanfreq(){
        int j=0;
        java.lang.String word=" "; /**stores the words in the sentence,one at a time*/
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '||text.charAt(i)=='.'||text.charAt(i)==','||text.charAt(i)=='!'||text.charAt(i)=='?'){
                word=text.substring(j,i);
                j=i+1;
                if(word.equals("an"))
                countan++;
            }
        }
    }
    void display(){
        System.out.println("The sentence in lower cases is: "+text);
        System.out.println("Number of and : "+countand);
        System.out.println("Number of an : "+countan);
    }
    public static void main(String args[])throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        Frequency obj=new Frequency(); 
        System.out.println("Enter the sentence:");
        java.lang.String n=input.readLine();
        obj.accept(n.toLowerCase()); /**question says pass in lowercase*/
        obj.checkandfreq();
        obj.checkanfreq();
        obj.display();
    }
}