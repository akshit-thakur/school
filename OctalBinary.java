import java.util.*;
class OctalBinary{
    public static void main(String args[]){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter an octal number:");
            String octal=read.nextLine();            String binary="";
            for(int i=0;i<octal.length();i++){
                switch(octal.charAt(i)){
                    case '0': binary=binary.concat("000"); break;
                    case '1': binary=binary.concat("001"); break;
                    case '2': binary=binary.concat("010"); break;
                    case '3': binary=binary.concat("011"); break;
                    case '4': binary=binary.concat("100"); break;
                    case '5': binary=binary.concat("101"); break;
                    case '6': binary=binary.concat("110"); break;
                    case '7': binary=binary.concat("111"); break;
                }
            }
            System.out.println("The binary of octal "+octal+" is "+binary);
        }
        catch(InputMismatchException e){
            System.out.println("Error in input!");
        }
    }
}