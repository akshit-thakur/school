import java.io.*;
class DispASCII
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter a word. ");
			String S=input.readLine();
		int len=S.length();
		for(int i=0;i<len;i++)
		{
			char ch=S.charAt(i);
			for(char temp='A';temp<='Z';temp++)
			{
				if(ch==temp)
				{
					int n=(int)ch;
					System.out.println("The ASCII value of "+ch+" is "+n);
				}
			}
			for(char temp='a';temp<='z';temp++)
			{
				if(ch==temp)
				{
					int n=(int)ch;
					System.out.println("The ASCII value of "+ch+" is "+n);
				}
			}
		}
	}
}	