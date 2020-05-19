import java.io.*;
class CaseExchange
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter a sentence: ");
		String S=input.readLine(); char ch=' ',ch1,ch2;
		int len=S.length();
		for(int i=0;i<len;i++)
		{
			ch=S.charAt(i);
			if(ch!=' '&&ch<='Z'&&ch>='A')
			{
				ch1=Character.toLowerCase(ch);
				S=S.replace(ch,ch1);
			}
			else if(ch<='z'&&ch>='a'&&ch!=' ')
			{
				ch2=Character.toUpperCase(ch);
				S=S.replace(ch,ch2);
			}
			
		}
		System.out.println(S);
	}
}	