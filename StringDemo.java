import java.io.*;
class StringDemo
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(rdr);
		System.out.println("Enter your name.");
		java.lang.String name=input.readLine();
		System.out.println("Your Name is: "+name);
	}
}
		


		