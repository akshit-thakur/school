import java.io.*;
class KarprekarNum{
    public static void main(String args[])throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number.");
        String n=input.readLine();
        int num=Integer.parseInt(n),square=num*num,sum=(int)(square%Math.pow(10,n.length()))+(int)(square/Math.pow(10,n.length()));              
        if(num==sum)
        System.out.println("The number is Carpreker Number.");
        else
        System.out.println("The number is not a Carpreker.");
    }
}