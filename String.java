//all in one program for Strings
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class String
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter a string: ");
		java.lang.String S=input.readLine();
		System.out.println("The reversed string is: ");
		for(int i=S.length();i>0;i--)
		{
			System.out.print(S.charAt(i));
		}
	}
}