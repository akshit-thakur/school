import java.io.*;
class OddEvenNegSum
{
	public static int esum=0,osum=0,nsum=0;
	public static void main(String args[]) throws IOException
	{
		System.out.println("Program to accept 10 values from user and display the sum of odd,even,negative number.");
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(rdr);
		System.out.println("\nEnter number.");
		int n1=Integer.parseInt(input.readLine());
		operation(n1);
		System.out.println("\nEnter number.");
		int n2=Integer.parseInt(input.readLine());
		operation(n2);
		System.out.println("\nEnter number.");
		int n3=Integer.parseInt(input.readLine());
		operation(n3);
		System.out.println("\nEnter number.");
		int n4=Integer.parseInt(input.readLine());
		operation(n4);
		System.out.println("\nEnter number.");
		int n5=Integer.parseInt(input.readLine());
		operation(n5);
		System.out.println("\nEnter number.");
		int n6=Integer.parseInt(input.readLine());
		operation(n6);
		System.out.println("\nEnter number.");
		int n7=Integer.parseInt(input.readLine());
		operation(n7);
		System.out.println("\nEnter number.");
		int n8=Integer.parseInt(input.readLine());
		operation(n8);
		System.out.println("\nEnter number.");
		int n9=Integer.parseInt(input.readLine());
		operation(n9);	
		System.out.println("\nEnter number.");
		int n10=Integer.parseInt(input.readLine());
		operation(n10);
		OddEvenNegSum obj=new OddEvenNegSum();
		System.out.println("Sum of odd numbers is: "+obj.osum);
		System.out.println("Sum of even numbers is: "+obj.esum);
		System.out.println("Sum of negative numbers is: "+obj.nsum);
	}
	public static int operation(int x)
	{
		if(x>0)
		{
			if(x%2==0)
			return osum=osum+x;
			else
			return esum=esum+x;
		}
		else
			return nsum=nsum+x;
	}
}