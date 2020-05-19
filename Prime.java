import java.io.*;
class Prime
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(rdr);
		System.out.println("Welcome to the program to check whether a number is prime or not..\n\n");
		System.out.println("Enter the number to be checked.....");
		int n=Integer.parseInt(input.readLine());	//n initialized
		prime(n);
	}
	public static void prime(int x)
	{	
		int prime=0;
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				prime=1;
				break;
			}
		}
		if(prime==1)
			System.out.println(x+" is not a prime number..");
		else
			System.out.println(x+" is a prime number..");
	}
}
		

		