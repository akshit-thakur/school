//icse 2008
import java.io.*;
class CharCaseRev
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter a sentence with uppercase alphabets anywhere.");
		String S=input.readLine();
		String str="";
		int len=S.length();
		for(int i=0;i<len;i++)
		{
			char ch=S.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				char ch1=Character.toUpperCase(ch);
				str+=ch1;
			}
			else if(ch>='A'&&ch<='Z')
			{
				char ch2=Character.toLowerCase(ch);
				str+=ch2;
			}
			else 
			{
				str+=ch; 
			}
		}
		System.out.println("The altered String is: "+str);
	}
}