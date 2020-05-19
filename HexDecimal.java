import java.io.*;
class HexDecimal{
    public static void main(String args[]) throws IOException{
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter a Hex number without OX .");
        String hex=input.readLine();  int p=0,dec=0;
        for(int i=hex.length()-1;i>=0;i--){            
            switch(hex.charAt(i)){                
                case '1': dec+=Math.pow(16,p);                 break;
                case '2': dec+=(2*(Math.pow(16,p)));           break;
                case '3': dec+=(3*(Math.pow(16,p)));           break;
                case '4': dec+=(4*(Math.pow(16,p)));           break;
                case '5': dec+=(5*(Math.pow(16,p)));           break;
                case '6': dec+=(6*(Math.pow(16,p)));           break;
                case '7': dec+=(7*(Math.pow(16,p)));           break;
                case '8': dec+=(8*(Math.pow(16,p)));           break;
                case '9': dec+=(9*(Math.pow(16,p)));           break;
                case 'A': dec+=(10*(Math.pow(16,p)));          break;
                case 'B': dec+=(1*(Math.pow(16,p)));           break;
                case 'C': dec+=(12*(Math.pow(16,p)));          break;
                case 'D': dec+=(13*(Math.pow(16,p)));          break;
                case 'E': dec+=(14*(Math.pow(16,p)));          break;
                case 'F': dec+=(15*(Math.pow(16,p)));          break;
            }
            p++;
        }
        System.out.println("The decimal of Hex "+hex+" is : "+dec);
    }
}