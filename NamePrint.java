import java.io.*;
class NamePrint
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(rdr);
		System.out.println("Enter you full name: ");
		String name=in.readLine();
		name.trim();
		System.out.println("The initials are: ");
		for(int i=0;i<name.length();i++)
		{
			if(i==0){	System.out.print(name.charAt(0)); }
			if(name.charAt(i)==' ')
			{
				System.out.print(name.charAt(i+1));
			}
		}
	}
}

			