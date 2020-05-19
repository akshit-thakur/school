import java.io.*;
class MaxNum
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(rdr);
		int a,b;
		System.out.println("Enter two numbers: ");
		String ch=in.readLine(); a=Integer.parseInt(ch);
		ch=in.readLine(); b=Integer.parseInt(ch);
		System.out.print("The number greater of the two is: ");
		System.out.print(Math.max(a,b));
	}
}