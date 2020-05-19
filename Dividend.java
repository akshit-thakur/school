import java.io.*;
class Dividend
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(rdr);
		System.out.println("Enter no. of shares: ");
		String ch=in.readLine(); int a=Integer.parseInt(ch);
		System.out.println("Enter company value: ");
		ch=in.readLine(); int b=Integer.parseInt(ch);
		System.out.println("Enter the rate: ");
		ch=in.readLine(); int c=Integer.parseInt(ch);
		float Dividend=(a*b*c)/100;
		System.out.print("The dividend is: ");
		System.out.print(Dividend);
	}
}
		
				
		