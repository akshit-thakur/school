import java.util.*;
class HexBinary{
    public static void main(String args[]){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter a hexadecimal number:");
            String hex=read.nextLine();            String binary="";
            for(int i=0;i<hex.length();i++){
                switch(hex.charAt(i)){
                    case '0': binary=binary.concat("0000"); break;
                    case '1': binary=binary.concat("0001"); break;
                    case '2': binary=binary.concat("0010"); break;
                    case '3': binary=binary.concat("0011"); break;
                    case '4': binary=binary.concat("0100"); break;
                    case '5': binary=binary.concat("0101"); break;
                    case '6': binary=binary.concat("0110"); break;
                    case '7': binary=binary.concat("0111"); break;
                    case '8': binary=binary.concat("1000"); break;
                    case '9': binary=binary.concat("1001"); break;
                    case 'A': binary=binary.concat("1010"); break;
                    case 'B': binary=binary.concat("1011"); break;
                    case 'C': binary=binary.concat("1100"); break;
                    case 'D': binary=binary.concat("1101"); break;
                    case 'E': binary=binary.concat("1110"); break;
                    case 'F': binary=binary.concat("1111");
                }
            }
            System.out.println("The binary of hexadecimal "+hex+" is "+binary);
        }
        catch(InputMismatchException e){
            System.out.println("Error in input!");
        }
    }
}