import java.io.*;
class ThrowDemo
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Program to divide two numbers.");
		System.out.println("Enter the value of dividend: ");
		int a=Integer.parseInt(in.readLine());
		System.out.println("Enter the value of divisor: ");	
		int b=Integer.parseInt(in.readLine());
		if(b<0) 
			throw Exception("The divisor can not be zero.");
		float c=a/b;
		System.out.println("The quotient is: "+c);
	}
}		
			