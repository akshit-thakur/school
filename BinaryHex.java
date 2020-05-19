import java.util.*;
class BinaryHex{
    public static void main(String args[]){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter a binary: ");
            String binary=read.nextLine(); String hex="";
            int len=binary.length(),j=0;
            if(len%4==1)
            binary="000".concat(binary);    /**to make it mulitple of 3 for pefect grouping*/
            else if(len%4==2)
            binary="00".concat(binary);/**same as above*/
            else if(len%4==3)
            binary="0".concat(binary);
            for(int i=0;i<len;i++){
                if(j+3<=len){
                    String subStr=binary.substring(j,j+4);                     
                    switch(subStr){
                        case "0000": hex=hex.concat("0"); break;
                        case "0001": hex=hex.concat("1"); break;
                        case "0010": hex=hex.concat("2"); break;
                        case "0011": hex=hex.concat("3"); break;
                        case "0100": hex=hex.concat("4"); break;
                        case "0101": hex=hex.concat("5"); break;
                        case "0110": hex=hex.concat("6"); break;
                        case "0111": hex=hex.concat("7"); break;    
                        case "1000": hex=hex.concat("8"); break;
                        case "1001": hex=hex.concat("9"); break;
                        case "1010": hex=hex.concat("A"); break;
                        case "1011": hex=hex.concat("B"); break;
                        case "1100": hex=hex.concat("C"); break;
                        case "1101": hex=hex.concat("D"); break;
                        case "1110": hex=hex.concat("E"); break;
                        case "1111": hex=hex.concat("F"); break;
                    }
                    j+=4;
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error in input");
        }
    }
}