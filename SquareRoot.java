import java.io.*;
class SquareRoot
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Program to find square root of decimal value. e.g. 4.0=2,0.09=0.3");
		System.out.println("Enter the value");
		double n=Integer.parseInt(in.readLine());
		double r=Math.sqrt(n);
		System.out.println("The result is: "+r);
	}
}