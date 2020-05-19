import java.io.*;
class DoubleLetter
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter a sentence: ");
		String S=input.readLine();
		S=S.toUpperCase();
		char ch=' ',ch1=' '; int count=0,len=S.length(); 
		for(int i=0;i<len-1;i++)
		{
			ch=S.charAt(i);
			ch1=S.charAt(i+1);
			if(ch1==ch)
			{
				count++;	
			}
		}
		System.out.println("There are "+count+" double letters");
	}	
}