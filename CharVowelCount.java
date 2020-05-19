import java.io.*;
class CharVowelCount
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter a word.");
		String S=input.readLine();
		int ctr=0;
		int len=S.length(); char ch;
		for(int i=0;i<len;i++)
		{
			ch=S.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				ctr++;
			}
		}
		System.out.println("no. of characters in the word. "+len);
		System.out.println("no. of vowels in the word. "+ctr);
		for(int i=len;i>0;i--)
		{
			System.out.print(S.charAt(i));
		}
	}
}
			
		