import java.io.*;
class ExceptionDemo
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in); 
		System.out.println("Enter two numbers for division: ");
		int c;
		try
		{
		int a=Integer.parseInt(in.readLine());
		int b=Integer.parseInt(in.readLine());
		c=a/b;
		System.out.println("The quotient is "+c);
		}
		catch(Exception e)
		{
			System.out.println("Divison by zero not possible");
		}
	}
}
			